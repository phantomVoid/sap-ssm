package com.phantom.wss;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * 工单投料(包装单)接口
 * @author:phantomsaber
 * @version:2019/8/13 19:07
 * @email:phantomsaber@foxmail.com
 **/
@WebService(name = "ProjectPackFeedIntf", targetNamespace = "http://cxf.temptation.cn/")
public interface ProjectPackFeedIntf {
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
    String ajaxExecByPorjectIds(@WebParam(name = "projecrIdsJson", partName = "projecrIdsJson") String projecrIdsJson);

    /**
     * @param logDetailIdsJson
     * @return
     */
    String ajaxRedoBySapLogDetail(@WebParam(name = "logDetailIdsJson", partName = "logDetailIdsJson") String logDetailIdsJson);
}
