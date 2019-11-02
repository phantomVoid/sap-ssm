package com.phantom.controller;

import com.phantom.comm.*;
import com.phantom.dao.*;
import com.phantom.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/pda/print")
@Controller
@CrossOrigin
public class PdaGetDataItemController {

    @Resource
    TCoItemDao itemDao;

    @Resource
    TPmProjectBaseDao baseDao;

    @Resource
    TPmProjectDetailDao detailDao;

    @Resource
    MlTemplateDao mlDao;

    @Resource
    TCoLabelDataconfigureDao labelDfDao;

    @Resource
    TCoLabelDatasourceDao labelDsDao;

    /**
     * 获取工单基础信息(原材合格证)
     * @param itemSn    物料编码
     * @param rawLicenseSn  原材批次
     * @param weightNum 重量
     * @param labelId   打印模板id
     * @param dataAuth  组织机构
     * @param response  response
     * @return  JSON
     */
    @RequestMapping(value = "/getProjectInfoByLicense")
    @ResponseBody
    public String getProjectInfo(
            @RequestParam(value = "itemSn") String itemSn,
            @RequestParam(value = "rawLicenseSn") String rawLicenseSn,
            @RequestParam(value = "weightNum") String weightNum,
            @RequestParam(value = "labelId") String labelId,
            @RequestParam(value = "dataAuth") String dataAuth,
            HttpServletResponse response) {

        itemSn = StringUtils.getUrlString(itemSn);
        rawLicenseSn = StringUtils.getUrlString(rawLicenseSn);
        weightNum = StringUtils.getUrlString(weightNum);
        labelId = StringUtils.getUrlString(labelId);
        dataAuth = StringUtils.getUrlString(dataAuth);

        List dataItem = getDataItem(itemSn, rawLicenseSn, weightNum, labelId, dataAuth);

        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Cache-Control", "no-cache");

        System.out.println("retJson : >>> ");
        System.out.println(StringUtils.getJsonStr(dataItem).toUpperCase());
        return StringUtils.getJsonStr(dataItem).toUpperCase();
    }

    /**
     * @param itemSn    物料编码
     * @param rawLicenseSn  原材批次
     * @param weightNum 重量
     * @param labelId   打印模板id
     * @param dataAuth  组织机构
     * @return
     */
    public List getDataItem(String itemSn, String rawLicenseSn, String weightNum,String labelId, String dataAuth) {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Map<String, Object>> labelList = new ArrayList<Map<String, Object>>();
        List<Map<String, Object>> stockList = new ArrayList<Map<String, Object>>();
        List<Map<String, Object>> resList = new ArrayList<Map<String, Object>>();
        List<Map<String, Object>> tempList = new ArrayList<Map<String, Object>>();
        List<Map<String, Object>> dataList = new ArrayList<Map<String, Object>>();
        List<Map<String, Object>> itemList = new ArrayList<Map<String, Object>>();
        Map<String, Object> resMsgMap = new HashMap<String, Object>();

        // 获取标签数据项信息
        MlTemplateExample mlExp = new MlTemplateExample();
        MlTemplateExample.Criteria mlExpCri = mlExp.createCriteria();
        mlExpCri.andIDEqualTo(labelId);

        List<MlTemplate> mlTemplates = mlDao.selectByExample(mlExp);

        Map<String, Object> labelMap = new HashMap<String, Object>();
        if (!mlTemplates.isEmpty() && mlTemplates != null) {
            labelMap.put("LABELCSS", itemList.get(0).get("LABELCSS"));
            dataList.add(labelMap);
        }

        labelList = labelDfDao.getLabelList(labelId, dataAuth);

        TCoLabelDatasourceExample labelDsExp = new TCoLabelDatasourceExample();
        TCoLabelDatasourceExample.Criteria dsExpCri = labelDsExp.createCriteria();
        dsExpCri.andCLD_LABEL_IDEqualTo(labelId);
        dsExpCri.andDATA_AUTHEqualTo(dataAuth);

        List<TCoLabelDatasource> labelDsList = labelDsDao.selectByExample(labelDsExp);
        return null;
    }
}
