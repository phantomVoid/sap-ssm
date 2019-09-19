package com.phantom.sap.demo;

import com.phantom.weChat.PushWeChat;

import java.util.ResourceBundle;

/**
 * JCO SAP连接测试
 *
 * @author:phantomsaber
 * @version:2019/7/11 14:31
 * @email:phantomsaber@foxmail.com
 **/
public class ThreadTest implements Runnable {
    public static void main(String[] args) {
        String s = doReturn();
        System.out.println(s);
        ThreadTest threadTest = new ThreadTest();
        threadTest.run();
    }

    @Override
    public void run() {
        // 每隔1s中输出一次当前线程的名字
//        while (true) {
            // 输出线程的名字，与主线程名称相区分
            printThreadInfo();
            try {
                // 线程休眠一秒
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
//        }
    }

    /**
     * 输出当前线程的信息
     */
    private static void printThreadInfo() {
        System.out.println("当前运行的线程名为： " + Thread.currentThread().getName());
    }

    private static String doReturn(){
        return "this is doReturn: >>>";
    }
}