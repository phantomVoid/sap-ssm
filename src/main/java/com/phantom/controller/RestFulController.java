package com.phantom.controller;

import com.phantom.comm.StringUtils;
import com.phantom.sap.intf.comm.impl.SapCommIntfImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.HashMap;
import java.util.Map;

/**
 * 账目核对Controller
 * @author:phantomsaber
 * @version:2019/9/30 23:13
 * @email:phantomsaber@foxmail.com
 **/
@Produces("RestFulController/http")
@Path("/webservice/account")
@Controller
@CrossOrigin
public class RestFulController extends SapCommIntfImpl {
    @ResponseBody
    @Path("/sync ")
    public String sync(@PathVariable("projectId") String projectId,HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin","*");
        response.setHeader("Cache-Control","no-cache");
        Map<String, String> map = new HashMap<>();
        map.put("FLAG", "Y");
        map.put("MESSAGE", "SUCCESS");
        return StringUtils.getJsonStr(map);
    }
}
