package com.phantom.demo;

import java.util.Enumeration;
import java.util.ResourceBundle;

public class propertiesDemo {
    public static void main(String[] args) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("sap-pro");
        //遍历取值
        Enumeration enumeration = resourceBundle.getKeys();
        while (enumeration.hasMoreElements()) {
            try {
                String value = resourceBundle.getString((String) enumeration.nextElement());
                System.out.println(new String(value.getBytes("ISO-8859-1"), "GBK"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
