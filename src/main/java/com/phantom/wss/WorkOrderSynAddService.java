package com.phantom.wss;

import com.phantom.pojo.*;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * SAP工单新增同步接口
 *
 * @author:phantomsaber
 * @version:2019/8/2 9:33
 * @email:phantomsaber@foxmail.com
 **/
@WebService(name = "WorkOrderSynAddService", targetNamespace = "http://cxf.temptation.cn/")
public interface WorkOrderSynAddService {

    /**
     * 获取工单信息
     *
     * @param orderBaseList
     * @param orderProcessList
     * @param orderReservedList
     * @param orderSalesList
     * @return
     */
    SapOrderRes getOrderList(@WebParam(name = "orderBase") List<SapOrderBase> orderBaseList,
                             @WebParam(name = "orderProcess") List<SapOrderProcess> orderProcessList,
                             @WebParam(name = "orderReserved") List<SapOrderReserved> orderReservedList,
                             @WebParam(name = "orderSales") List<SapOrderSales> orderSalesList);
}
