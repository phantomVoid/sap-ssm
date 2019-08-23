package com.phantom.wss;

import com.phantom.pojo.*;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * SAP工单修改同步接口
 *
 * @author:phantomsaber
 * @version:2019/8/2 9:33
 * @email:phantomsaber@foxmail.com
 **/
@WebService(name = "WorkOrderSynEditService", targetNamespace = "http://cxf.temptation.cn/")
public interface WorkOrderSynEditService {
    /**
     * 获取工单信息
     *
     * @param orderBaseList
     * @return
     */
    SapOrderRes getEditOrderList(@WebParam(name = "orderBase") List<SapOrderBase> orderBaseList);
}
