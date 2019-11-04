package com.phantom.controller;

import com.phantom.comm.*;
import com.phantom.comm.enums.Flag;
import com.phantom.dao.SyUserDao;
import com.phantom.dao.TPmProjectBaseDao;
import com.phantom.dao.TPmProjectRelDao;
import com.phantom.model.*;
import com.phantom.pojo.MapRes;
import com.phantom.pojo.PdaJsonBase;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/pda/doBuss")
@Controller
@CrossOrigin
public class PdaDoBussController {

    @Resource
    TPmProjectBaseDao baseDao;

    @Resource
    TPmProjectRelDao relDao;

    @Resource
    SyUserDao userDao;

    /**
     * PDA工单备料接口
     *
     * @param projectId 工单号
     * @param userName  操作用户loginName
     * @param response
     * @return
     */
    @RequestMapping(value = "/doPrepare")
    @ResponseBody
    public String doPrepare(@RequestParam(value = "PROJECT_ID") String projectId, @RequestParam(value = "CUR_USER") String userName, @RequestParam(value = "DATA_AUTH") String dataAuth, HttpServletResponse response) {
        PdaJsonBase jsonBase = new PdaJsonBase();

        try {

            String userId = getUserId(userName);
            jsonBase.setSflag(Flag.Y.toString());
            jsonBase.setMessage("生产备料" + Flag.Y.getDesc());

            TPmProjectBaseExample baseExp = new TPmProjectBaseExample();
            TPmProjectBaseExample.Criteria baseExpCri = baseExp.createCriteria();

            baseExpCri.andPROJECT_IDEqualTo(projectId);

            List<TPmProjectBase> baseList = baseDao.selectByExample(baseExp);

            if (!(baseList.size() > 0)) {
                jsonBase.setSflag(Flag.N.toString());
                jsonBase.setMessage(projectId + "该工单不存在");
                throw new Exception(projectId + "该工单不存在");
            }

            //工单状态（0开立1投产2关结3备料4投料5包装）
            baseExpCri.andPROJECT_STATUSEqualTo("0");

            baseList = baseDao.selectByExample(baseExp);
            if (!(baseList.size() > 0)) {
                jsonBase.setSflag(Flag.Y.toString());
                jsonBase.setMessage(projectId + "该工单已备料");
                return StringUtils.getJsonStr(jsonBase).toUpperCase();
            }

            //是否关联（0未关联，1已关联下级，2已关联上级，3自关联）
            baseExpCri.andIS_RELNotEqualTo("0");

            for (TPmProjectBase projectBase : baseList) {
                //更新工单状态（0开立1投产2关结3备料4投料5包装）
                projectBase.setPROJECT_STATUS("3");
                projectBase.setEDIT_TIME(DateUtils.getCurDateTime());
                projectBase.setEDIT_USER(userId);
                projectBase.setCHECK_MON(DateUtils.getCurDateTime());
                projectBase.setCHECK_USER(userId);
                projectBase.setDATA_AUTH(dataAuth);

                baseDao.updateByExample(projectBase, baseExp);
            }

            //查询关联工单
            TPmProjectRelExample relExp = new TPmProjectRelExample();
            relExp.or().andPROJECT_IDEqualTo(projectId).andREL_PROJECT_IDEqualTo(projectId);

            List<TPmProjectRel> relList = relDao.selectByExample(relExp);

            if (relList.size() < 1) {
                MapRes mapRes = ProjectUtils.doQuickRel(baseDao, relDao, projectId, dataAuth, userId);
            }

            List<String> relProjectIdList = new ArrayList<>();
            for (TPmProjectRel projectRel : relList) {
                relProjectIdList.add(projectRel.getREL_PROJECT_ID());
            }

            baseExp.createCriteria().andPROJECT_IDIn(relProjectIdList);
            List<TPmProjectBase> relBaseList = baseDao.selectByExample(baseExp);
            for (TPmProjectBase projectBase : relBaseList) {
                projectBase.setPROJECT_STATUS("3");
                projectBase.setEDIT_TIME(DateUtils.getCurDateTime());
                projectBase.setEDIT_USER(userId);
                projectBase.setCHECK_MON(DateUtils.getCurDateTime());
                projectBase.setCHECK_USER(userId);
                projectBase.setDATA_AUTH(dataAuth);

                baseDao.updateByExample(projectBase, baseExp);
            }

            relExp.or().andPROJECT_IDEqualTo(projectId).andREL_PROJECT_IDEqualTo(projectId);
            List<TPmProjectRel> rels = relDao.selectByExample(relExp);
            for (TPmProjectRel rel : rels) {
                rel.setDATA_AUTH(dataAuth);
                relDao.updateByExample(rel, relExp);
            }


        } catch (Exception e) {
            jsonBase.setSflag(Flag.N.toString());
            jsonBase.setMessage(e.getMessage());
        }

        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Cache-Control", "no-cache");

        System.out.println("retJson : >>> ");
        System.out.println(StringUtils.getJsonStr(jsonBase).toUpperCase());

        return StringUtils.getJsonStr(jsonBase).toUpperCase();
    }

    /**
     * PDA工单取消备料接口
     *
     * @param projectId 工单号
     * @param userName  操作用户ID
     * @param response
     * @return
     */
    @RequestMapping(value = "/unPrepare")
    @ResponseBody
    public String unPrepare(@RequestParam(value = "PROJECT_ID") String projectId, @RequestParam(value = "CUR_USER") String userName, HttpServletResponse response) {
        PdaJsonBase jsonBase = new PdaJsonBase();

        try {
            String userId = getUserId(userName);

            jsonBase.setSflag(Flag.Y.toString());
            jsonBase.setMessage("取消备料" + Flag.Y.getDesc());
            TPmProjectBaseExample baseExp = new TPmProjectBaseExample();
            TPmProjectBaseExample.Criteria baseExpCri = baseExp.createCriteria();

            baseExpCri.andPROJECT_IDEqualTo(projectId);
            List<TPmProjectBase> baseList = baseDao.selectByExample(baseExp);

            if (!(baseList.size() > 0)) {
                jsonBase.setSflag(Flag.N.toString());
                jsonBase.setMessage(projectId + "该工单不存在");
                throw new Exception(projectId + "该工单不存在");
            }

            //工单状态（0开立1投产2关结3备料4投料5包装）
            for (TPmProjectBase projectBase : baseList) {
                String status = projectBase.getPROJECT_STATUS();
                int state = -1;

                try {
                    state = Integer.valueOf(status);
                } catch (Exception e) {
                    jsonBase.setSflag(Flag.N.toString());
                    jsonBase.setMessage(projectId + "工单工单状态异常,无法取消备料");
                    throw new Exception(jsonBase.getMessage());
                }

                if (state != 3) {
                    String curStatus = null;
                    switch (state) {
                        case 0:
                            curStatus = "开立";
                            break;
                        case 2:
                            curStatus = "关结";
                            break;
                        case 3:
                            curStatus = "备料";
                            break;
                        case 4:
                            curStatus = "投料";
                            break;
                        case 5:
                            curStatus = "包装";
                            break;
                        default:
                            curStatus = "未知";
                            break;
                    }
                    jsonBase.setSflag(Flag.N.toString());
                    jsonBase.setMessage(projectId + "工单状态:" + curStatus + "无法取消备料");
                    throw new Exception(jsonBase.getMessage());
                } else if (state == 3) {
                    break;
                } else {
                    jsonBase.setSflag(Flag.N.toString());
                    jsonBase.setMessage(projectId + "工单未备料,无法取消备料");
                    throw new Exception(jsonBase.getMessage());
                }
            }

            baseExpCri.andPROJECT_STATUSEqualTo("3");
            //是否关联（0未关联，1已关联下级，2已关联上级，3自关联）
            baseExpCri.andIS_RELNotEqualTo("0");

            baseList = baseDao.selectByExample(baseExp);

            if (!(baseList.size() > 0)) {
                jsonBase.setSflag(Flag.N.toString());
                jsonBase.setMessage(projectId + "该工单不存在");
                throw new Exception(projectId + "该工单不存在");
            }

            for (TPmProjectBase projectBase : baseList) {
                //更新工单状态（0开立1投产2关结3备料4投料5包装）
                projectBase.setPROJECT_STATUS("0");
                projectBase.setEDIT_TIME(DateUtils.getCurDateTime());
                projectBase.setEDIT_USER(userId);
                projectBase.setCHECK_MON(DateUtils.getCurDateTime());
                projectBase.setCHECK_USER(userId);
                baseDao.updateByExample(projectBase, baseExp);
            }

            //查询关联工单
            TPmProjectRelExample relExp = new TPmProjectRelExample();
            TPmProjectRelExample.Criteria relExpCri = relExp.createCriteria();
            relExpCri.andPROJECT_IDEqualTo(projectId);

            List<TPmProjectRel> relList = relDao.selectByExample(relExp);

            List<String> relProjectIdList = new ArrayList<>();
            for (TPmProjectRel projectRel : relList) {
                relProjectIdList.add(projectRel.getREL_PROJECT_ID());
            }

            baseExpCri.andPROJECT_IDIn(relProjectIdList);
            List<TPmProjectBase> relBaseList = baseDao.selectByExample(baseExp);
            for (TPmProjectBase projectBase : relBaseList) {
                projectBase.setPROJECT_STATUS("0");
                projectBase.setEDIT_TIME(DateUtils.getCurDateTime());
                projectBase.setEDIT_USER(userId);
                projectBase.setCHECK_MON(DateUtils.getCurDateTime());
                projectBase.setCHECK_USER(userId);
                baseDao.updateByExample(projectBase, baseExp);
            }
        } catch (Exception e) {
            jsonBase.setSflag(Flag.N.toString());
            jsonBase.setMessage(e.getMessage());
        }

        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Cache-Control", "no-cache");

        System.out.println("retJson : >>> ");
        System.out.println(StringUtils.getJsonStr(jsonBase).toUpperCase());

        return StringUtils.getJsonStr(jsonBase).toUpperCase();
    }

    /**
     * 获取登录用户ID
     *
     * @return
     */
    public String getUserId(String userName) {
        String userId = null;
        try {
            SyUserExample userExp = new SyUserExample();
            userExp.createCriteria().andLOGIN_NAMEEqualTo("wzx");
            List<SyUser> syUsers = userDao.selectByExample(userExp);
            userId = syUsers.get(0).getID();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userId;
    }
}
