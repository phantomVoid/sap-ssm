package com.phantom.sap.demo;

import com.phantom.sap.comm.JCOProvider;
import com.phantom.weChat.PushWeChat;
import com.sap.conn.jco.ext.Environment;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * JCO SAP连接测试
 *
 * @author:phantomsaber
 * @version:2019/7/11 14:31
 * @email:phantomsaber@foxmail.com
 **/
public class WeChatTest {
    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("weChat");

    public static void main(String[] args) {
        String wechatUrl = resourceBundle.getString("wechat-url");
        String apikey = resourceBundle.getString("apikey");

        String path = wechatUrl + "?" + apikey;

        try {
            String postResult = PushWeChat.post(path, "");
            System.out.println(postResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}