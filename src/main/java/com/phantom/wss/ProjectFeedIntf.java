package com.phantom.wss;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * 工单投料(制造单)投料接口
 *
 * @author:phantomsaber
 * @version:2019/7/25 9:33
 * @email:phantomsaber@foxmail.com
 **/
@WebService(name = "ProjectFeedIntf", targetNamespace = "http://cxf.temptation.cn/")
public interface ProjectFeedIntf {

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

    String quartzExec();
}
