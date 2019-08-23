package com.phantom.sap.intf;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * 工单报工接口
 *
 * @author:phantomsaber
 * @version:2019/8/7 11:40
 * @email:phantomsaber@foxmail.com
 **/
@WebService(name = "ProjectReportIntf", targetNamespace = "http://cxf.temptation.cn/")
public interface ProjectReportIntf {
    /**
     * post by ids json
     * @param idsJson
     * @return
     */
    String ajaxExecByIds(@WebParam(name = "idsJson", partName = "idsJson") String idsJson);

    /**
     * post by projectIds json
     * @param projecrIdsJson
     * @return
     */
    String ajaxExecByPorjectIds(@WebParam(name = "projecrIdsJson",partName = "projecrIdsJson") String projecrIdsJson);
}
