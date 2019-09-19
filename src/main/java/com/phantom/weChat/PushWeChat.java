package com.phantom.weChat;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.phantom.comm.DateUtils;
import com.phantom.comm.StringUtils;
import com.phantom.comm.enums.SendType;
import com.phantom.model.TWechatLog;
import com.phantom.trans.WechatPostTrans;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ResourceBundle;


public class PushWeChat {
    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("weChat");

    /**
     * 发送HttpPost请求
     *
     * @param strURL 服务地址
     * @param params json字符串,例如: "{ \"id\":\"12345\" }" ;其中属性名必须带双引号<br/>
     * @return 成功:返回json字符串<br/>
     */
    public static String post(String strURL, String params) {
        BufferedReader reader = null;
        try {
            URL url = new URL(strURL);// 创建连接
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setUseCaches(false);
            connection.setInstanceFollowRedirects(true);
            connection.setRequestMethod("POST"); // 设置请求方式
            // connection.setRequestProperty("Accept", "application/json"); // 设置接收数据的格式
            connection.setRequestProperty("Content-Type", "application/json"); // 设置发送数据的格式
            connection.connect();
            //一定要用BufferedReader 来接收响应， 使用字节来接收响应的方法是接收不到内容的
            OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream(), "UTF-8"); // utf-8编码
            out.append(params);
            out.flush();
            out.close();
            // 读取响应
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
            String line;
            String res = "";
            while ((line = reader.readLine()) != null) {
                res += line;
            }
            reader.close();
            return res;
        } catch (Exception e) {
            return e.getMessage();
        }
//        return "error"; // 自定义错误信息
    }

    public TWechatLog getWeChatLog(){
        String wechatUrl = resourceBundle.getString("wechat-url");
        String apikey = resourceBundle.getString("apikey");
        String path = wechatUrl + "?" + apikey;

        String userCode = "";
        String linkUrl = "";
        String content = "";

        TWechatLog wechatLog = new TWechatLog();

        wechatLog.setID(StringUtils.getUUID());
        wechatLog.setDEPT_ID(StringUtils.getDefaultDeptId());
        wechatLog.setCREATE_USER(StringUtils.getDefaultUserId());
        wechatLog.setCREATE_TIME(DateUtils.getCurDateTime());
        wechatLog.setDATA_AUTH(StringUtils.getDefaultDataAuth());
        wechatLog.setUSER_CODE(userCode);
        wechatLog.setLINK_URL(linkUrl);
        wechatLog.setCONTENT(content);

        WechatPostTrans postTrans = new WechatPostTrans();
        postTrans.setUserCode(wechatLog.getUSER_CODE());
        postTrans.setLinkUrl(wechatLog.getLINK_URL());
        postTrans.setPhone(wechatLog.getPHONE());
        postTrans.setContent(wechatLog.getCONTENT());

        String params = JSON.toJSONString(postTrans);
        try {
            String receiveResult = PushWeChat.post(path, params);
            JSONObject jsonObject = JSON.parseObject(receiveResult);

            String sendTime = jsonObject.get("sendTime").toString();
            String sendType = jsonObject.get("sendType").toString();
            String message = jsonObject.get("message").toString();

            wechatLog.setSEND_TIME(DateUtils.formatDateTime(sendTime));
            wechatLog.setSEND_TYPE(sendType);
            wechatLog.setMESSAGE(message);
        } catch (Exception e) {
            wechatLog.setSEND_TIME(DateUtils.getCurDateTime());
            wechatLog.setSEND_TYPE("error");
            wechatLog.setMESSAGE(e.getMessage());
        }
        return wechatLog;
    }
}
