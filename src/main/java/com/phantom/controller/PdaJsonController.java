package com.phantom.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.util.StringUtil;
import com.phantom.comm.NumUtils;
import com.phantom.comm.StringUtils;
import com.phantom.comm.enums.Flag;
import com.phantom.dao.TCoItemDao;
import com.phantom.dao.TPmProjectBaseDao;
import com.phantom.dao.TPmProjectDetailDao;
import com.phantom.model.*;
import com.phantom.pojo.PdaJsonBase;
import com.phantom.pojo.pda.PdaBomListBase;
import com.phantom.pojo.pda.RawLicenseSnBase;
import com.phantom.pojo.pda.inner.PdaBomListInner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/pda")
@Controller
@CrossOrigin
public class PdaJsonController {

    @Resource
    TCoItemDao itemDao;

    @Resource
    TPmProjectBaseDao baseDao;

    @Resource
    TPmProjectDetailDao detailDao;


    /**
     * 获取工单基础信息
     * @param projectId 工单号
     * @param productLine 车间编码
     * @param response
     * @return
     */
    @RequestMapping(value = "/getProjectInfoWithLine")
    @ResponseBody
    public String getProjectInfo(@RequestParam(value = "PROJECT_ID") String projectId, @RequestParam(value = "PRODUCT_LINE") String productLine, HttpServletResponse response){
        PdaJsonBase jsonBase = new PdaJsonBase();

        TPmProjectBaseExample baseExample = new TPmProjectBaseExample();
        TPmProjectDetailExample detailExample = new TPmProjectDetailExample();

        TPmProjectBaseExample.Criteria baseCri = baseExample.createCriteria();
        TPmProjectDetailExample.Criteria detailCri = detailExample.createCriteria();

        baseCri.andPROJECT_IDEqualTo(projectId);
        baseCri.andPRODUCT_LINEEqualTo(productLine);

        detailCri.andPROJECT_IDEqualTo(projectId);

        List<TPmProjectBase> baseList = baseDao.selectByExample(baseExample);
        List<TPmProjectDetail> detailList = detailDao.selectByExample(detailExample);

        PdaBomListBase pdaBomListBase = null;
        try {
            pdaBomListBase = getPdaBomListBase(baseList.get(0), detailList);
            jsonBase.setSflag(Flag.Y.toString());
            jsonBase.setMessage(Flag.Y.getDesc());
        } catch (Exception e) {
            jsonBase.setSflag(Flag.N.toString());
            jsonBase.setMessage(Flag.N.getDesc());
        }

        String resJson = StringUtils.getJsonStr(pdaBomListBase);

        jsonBase.setJson(JSON.parseObject(resJson));

        response.setHeader("Access-Control-Allow-Origin","*");
        response.setHeader("Cache-Control","no-cache");

        System.out.println("retJson : >>> ");
        System.out.println(StringUtils.getJsonStr(jsonBase).toUpperCase());
        return StringUtils.getJsonStr(jsonBase).toUpperCase();
    }

    /**
     * 获取工单基础信息(原材合格证)
     * @param licenseSn 原材合格SN
     * @param response
     * @return
     */
    @RequestMapping(value = "/getProjectInfoByLicense")
    @ResponseBody
    public String getProjectInfo(@RequestParam(value = "RAW_LICENSE_SN") String licenseSn,HttpServletResponse response){

        licenseSn = StringUtils.getUrlString(licenseSn);

        PdaJsonBase jsonBase = getPdaJsonBase(licenseSn);

        response.setHeader("Access-Control-Allow-Origin","*");
        response.setHeader("Cache-Control","no-cache");

        System.out.println("retJson : >>> ");
        System.out.println(StringUtils.getJsonStr(jsonBase).toUpperCase());

        return StringUtils.getJsonStr(jsonBase).toUpperCase();
    }

    /**
     * 获取PdaBomListBase
     * @param projectBase
     * @param detailList
     * @return
     */
    public PdaBomListBase getPdaBomListBase(TPmProjectBase projectBase, List<TPmProjectDetail> detailList){
        PdaBomListBase bomBase = new PdaBomListBase();
        bomBase.setPRODUCT_LINE(projectBase.getPRODUCT_LINE());
        bomBase.setPROJECT_ID(projectBase.getPROJECT_ID());
        bomBase.setPRODUCT_MATERIAL(projectBase.getPRODUCT_MATERIAL());
        bomBase.setPRODUCT_NAME(projectBase.getPRODUCT_NAME());
        bomBase.setLOT_NUMBER(projectBase.getLOT_NUMBER());
        bomBase.setPRODUCT_COUNT(projectBase.getPRODUCT_COUNT());
        bomBase.setFINISH_COUNT(projectBase.getFINISH_COUNT());

        List<PdaBomListInner> bomInnerList = new ArrayList<>();
        for (TPmProjectDetail detail : detailList) {
            String itemCode = detail.getCBD_ITEM_CODE();

            TCoItemExample itemExample = new TCoItemExample();
            TCoItemExample.Criteria itemCriteria = itemExample.createCriteria();
            itemCriteria.andCI_ITEM_CODEEqualTo(itemCode);

            List<TCoItem> itemList = null;
            String stockCode = null;
            try {
                itemList = itemDao.selectByExample(itemExample);
                if(itemList.size() > 0){
                    stockCode = itemList.get(0).getSTOCK_CODE();
                }else{
                    stockCode = "";
                }
            } catch (Exception e) {
                stockCode = "";
            }

            PdaBomListInner bomInner = new PdaBomListInner();
            bomInner.setITEM_CODE(itemCode);
            bomInner.setSTOCK_CODE(stockCode);
            bomInner.setITEM_NUM(detail.getCBD_ITEM_NUM());
            bomInnerList.add(bomInner);
        }
        bomBase.setITEM_LIST(bomInnerList);

        return bomBase;
    }

    /**
     * 获取PdaJsonBase（原材合格证）
     * @param licenseSn 原材合格证
     * @return
     */
    public PdaJsonBase getPdaJsonBase(String licenseSn){
        PdaJsonBase jsonBase = new PdaJsonBase();

        String[] split = licenseSn.split("\\$");
        int length = split.length;

        String itemCode = null;
        String stockCode = null;
        String rawLot = null;
        String weightNum = null;

        switch (length){
            case 0:
                break;
            case 1:
                stockCode = String.valueOf(split[0]);
                break;
            case 2:
                stockCode = String.valueOf(split[0]);
                rawLot = String.valueOf(split[1]);
                break;
            case 3:
                stockCode = String.valueOf(split[0]);
                rawLot = String.valueOf(split[1]);
                weightNum = String.valueOf(split[2]);
                break;
            default:
                break;
        }

        TCoItemExample itemExample = new TCoItemExample();
        TCoItemExample.Criteria itemCri = itemExample.createCriteria();
        itemCri.andSTOCK_CODEEqualTo(stockCode);

        List<TCoItem> itemList = itemDao.selectByExample(itemExample);

        RawLicenseSnBase licenseSnBase = new RawLicenseSnBase();
        Map<String, String> map = new HashMap<>();

        int size = itemList.size();

        if(size == 1){
            jsonBase.setSflag(Flag.Y.toString());
            jsonBase.setMessage(Flag.Y.getDesc());

            TCoItem item = itemList.get(0);
            itemCode = item.getCI_ITEM_CODE();

            licenseSnBase.setITEM_CODE(itemCode);
            licenseSnBase.setSTOCK_CODE(stockCode);
            licenseSnBase.setLOT_NUMBER(rawLot);
            licenseSnBase.setWEIGHT_NUM(NumUtils.formatBigDecimal(weightNum));

            String resJson = StringUtils.getJsonStr(licenseSnBase).toUpperCase();
            jsonBase.setJson(JSON.parseObject(resJson));

            return jsonBase;
        }else{
            jsonBase.setSflag(Flag.N.toString());
            jsonBase.setMessage(Flag.N.getDesc());
            if(size > 0){
                map.put("STATUS", "原材合格证匹配失败，存货代码:"+stockCode+"存在多个匹配项");
            }else{
                map.put("STATUS", "原材合格证匹配失败，无匹配项");
            }
            jsonBase.setJson(JSON.parseObject(StringUtils.getJsonStr(map)));

            return jsonBase;
        }

    }
}
