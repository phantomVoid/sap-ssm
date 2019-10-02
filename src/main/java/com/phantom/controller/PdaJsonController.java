package com.phantom.controller;

import com.phantom.comm.StringUtils;
import com.phantom.pojo.PdaJsonBase;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("/pda")
@Controller
@CrossOrigin
public class PdaJsonController {
    @RequestMapping(value = "/getProjectInfoWithLine")
    @ResponseBody
    public String getProjectInfo(@RequestParam(value = "PROJECT_ID") String projectId, @RequestParam(value = "PRODUCT_LINE") String productLine, HttpServletResponse response){
        PdaJsonBase jsonBase = new PdaJsonBase();
        Map<String, String> map = new HashMap<>();
        map.put("PROJECT_ID", projectId);
        map.put("PRODUCT_LINE", productLine);

        jsonBase.setSflag("Y");
        jsonBase.setMessage("SUCCESS");
        jsonBase.setJson(StringUtils.getJsonStr(map));

        response.setHeader("Access-Control-Allow-Origin","*");
        response.setHeader("Cache-Control","no-cache");

        System.out.println(StringUtils.getJsonStr(jsonBase).toUpperCase());
        return StringUtils.getJsonStr(jsonBase).toUpperCase();
    }
}
