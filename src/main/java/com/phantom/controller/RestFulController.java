package com.phantom.controller;

import com.github.pagehelper.util.StringUtil;
import com.phantom.comm.DateUtils;
import com.phantom.comm.NumUtils;
import com.phantom.comm.StringUtils;
import com.phantom.comm.enums.Flag;
import com.phantom.comm.enums.IntfType;
import com.phantom.dao.*;
import com.phantom.model.*;
import com.phantom.pojo.SapAccountCheck;
import com.phantom.pojo.SapRes;
import com.phantom.sap.comm.RfcManager;
import com.phantom.sap.intf.comm.impl.SapCommIntfImpl;
import com.phantom.trans.ProjectAccountCheckTransEnum;
import com.sap.conn.jco.JCoField;
import com.sap.conn.jco.JCoFunction;
import com.sap.conn.jco.JCoParameterList;
import com.sap.conn.jco.JCoTable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
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
