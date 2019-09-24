package com.phantom.wss;

import com.phantom.pojo.SapAccountCheck;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * SAP账目核对
 *
 * @author:phantomsaber
 * @version:2019/9/19 22:00
 * @email:phantomsaber@foxmail.com
 **/
@WebService(name = "ProjectAccountCheckIntf", targetNamespace = "http://cxf.temptation.cn/")
public interface ProjectAccountCheckIntf {

    String sync(@WebParam(name = "projectIdList") List<SapAccountCheck> projectList, @WebParam(name = "startDay") String startDay, @WebParam(name = "endDay") String endDay);
}
