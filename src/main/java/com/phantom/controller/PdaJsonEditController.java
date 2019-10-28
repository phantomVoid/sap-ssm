package com.phantom.controller;

import com.phantom.comm.*;
import com.phantom.comm.enums.Flag;
import com.phantom.dao.TCoItemDao;
import com.phantom.dao.TPmProjectBaseDao;
import com.phantom.dao.TPmProjectDetailDao;
import com.phantom.pojo.PdaJsonBase;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

@RequestMapping("/pda/update")
@Controller
@CrossOrigin
public class PdaJsonEditController {

    @Resource
    TCoItemDao itemDao;

    @Resource
    TPmProjectBaseDao baseDao;

    @Resource
    TPmProjectDetailDao detailDao;

    /**
     * 修改工单基础信息
     * @param json
     * @param response
     * @return
     */
    @RequestMapping(value = "/editProjectInfoWithLine")
    @ResponseBody
    public String editProjectInfoWithLine(@RequestParam(value = "JSON") String json, HttpServletResponse response) {
        PdaJsonBase jsonBase = new PdaJsonBase();

        if(json.length() > 0){
            jsonBase.setMessage(Flag.Y.getDesc());
            jsonBase.setSflag(Flag.Y.toString());
            System.out.println("retJson : >>> ");
        }else{
            jsonBase.setMessage(Flag.N.getDesc());
            jsonBase.setSflag(Flag.N.toString());
            System.out.println("retJson : >>> ");
        }

        System.out.println(StringUtils.getJsonStr(jsonBase).toUpperCase());
        return StringUtils.getJsonStr(jsonBase).toUpperCase();
    }

    /**
     * 修改工单基础信息(原材合格证)
     * @param json
     * @param response
     * @return
     */
    @RequestMapping(value = "/editProjectInfoByLicense")
    @ResponseBody
    public String editProjectInfoByLicense(@RequestParam(value = "JSON") String json, HttpServletResponse response) {
        PdaJsonBase jsonBase = new PdaJsonBase();

        if(json.length() > 0){
            jsonBase.setMessage(Flag.Y.getDesc());
            jsonBase.setSflag(Flag.Y.toString());
            System.out.println("retJson : >>> ");
        }else{
            jsonBase.setMessage(Flag.N.getDesc());
            jsonBase.setSflag(Flag.N.toString());
            System.out.println("retJson : >>> ");
        }

        System.out.println(StringUtils.getJsonStr(jsonBase).toUpperCase());
        return StringUtils.getJsonStr(jsonBase).toUpperCase();
    }

    /**
     * 修改工单基础信息（工单号）
     * @param json
     * @param response
     * @return
     */
    @RequestMapping(value = "/editProjectInfoByIdOnly")
    @ResponseBody
    public String editProjectInfoByIdOnly(@RequestParam(value = "JSON") String json, HttpServletResponse response) {
        PdaJsonBase jsonBase = new PdaJsonBase();

        if(json.length() > 0){
            jsonBase.setMessage(Flag.Y.getDesc());
            jsonBase.setSflag(Flag.Y.toString());
            System.out.println("retJson : >>> ");
        }else{
            jsonBase.setMessage(Flag.N.getDesc());
            jsonBase.setSflag(Flag.N.toString());
            System.out.println("retJson : >>> ");
        }

        System.out.println(StringUtils.getJsonStr(jsonBase).toUpperCase());
        return StringUtils.getJsonStr(jsonBase).toUpperCase();
    }
}
