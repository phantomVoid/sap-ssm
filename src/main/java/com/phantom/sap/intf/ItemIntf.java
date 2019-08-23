package com.phantom.sap.intf;
import com.phantom.sap.intf.comm.SapCommIntf;

import javax.jws.WebService;
import java.util.Map;

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
}
