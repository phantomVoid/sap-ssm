package com.phantom.comm;

import com.phantom.comm.enums.IntfType;
import com.phantom.dao.TPmProjectBaseDao;
import com.phantom.dao.TProjectSapLogDao;
import com.phantom.model.TPmProjectBase;
import com.phantom.model.TPmProjectBaseExample;
import com.phantom.model.TProjectSapLog;

import java.util.ArrayList;
import java.util.List;

/**
 * 字符串工具类
 *
 * @author:phantomsaber
 * @version:2019/8/4 0:52
 * @email:phantomsaber@foxmail.com
 **/
public class ProjectSapLogUtils {

    public final static String intfName = IntfType.projectAdd.getFuncName();
    public final static String intfType = IntfType.projectAdd.getCode();

    /**
     * save projectBase 保存工单基础
     *
     * @param projectList
     */
    public static List<String> saveProjectSapLog(TProjectSapLogDao sapLogDao, TPmProjectBaseDao projectBaseDao, List<TPmProjectBase> projectList) {


        List<String> logList = new ArrayList<>();
        for (TPmProjectBase projectBase : projectList) {
            TPmProjectBaseExample baseExample = new TPmProjectBaseExample();
            TPmProjectBaseExample.Criteria baseExampleCriteria = baseExample.createCriteria();
            baseExampleCriteria.andPROJECT_IDEqualTo(StringUtils.formatZero(projectBase.getPROJECT_ID()));
            List<TPmProjectBase> projectBaseList = projectBaseDao.selectByExample(baseExample);
            int countProjectId = projectBaseList.size();

            String projectStatus = projectBase.getPROJECT_STATUS();

            if("0".equalsIgnoreCase(projectStatus)){
                if (countProjectId > 0) {
                    projectBase.setEDIT_TIME(DateUtils.getCurDate());
                    projectBase.setEDIT_USER(StringUtils.getDefaultUserId());
                    int update = projectBaseDao.updateByExample(projectBase, baseExample);
                    if (update < 1) {
                        break;
                    }
                }else {
                    int insert = projectBaseDao.insert(projectBase);
                    if (insert < 1) {
                        break;
                    }
                }
            }else{
//                tRfcLog.setRL_SY_ERROR("工单:"+projectBase.getPROJECT_ID()+"|状态:"+projectStatus+"|res:禁止更新");
            }
//            if(!StringUtils.isEmpty(tRfcLog.getRL_SY_ERROR())){
//                logList.add(StringUtils.getJsonStr(tRfcLog));
//            }
        }
        if(logList.size()>0){
            return logList;
        }else{
            return new ArrayList<>();
        }
    }
}
