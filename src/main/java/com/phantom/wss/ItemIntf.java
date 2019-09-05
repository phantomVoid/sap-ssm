package com.phantom.wss;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * 物料信息接口
 * @author:phantomsaber
 * @version:2019/7/25 9:33
 * @email:phantomsaber@foxmail.com
 **/
@WebService(name = "ItemIntf", targetNamespace = "http://cxf.temptation.cn/")
public interface ItemIntf {
    /**
     * 执行
     * @return
     */
    String exec();

    String ajaxExec(@WebParam(name = "low", partName = "low") String low, @WebParam(name = "hight", partName = "hight") String hight);
}
