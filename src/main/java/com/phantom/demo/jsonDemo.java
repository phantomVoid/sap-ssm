package com.phantom.demo;

public class jsonDemo {
    public static void main(String[] args) {
        String str = String.format("%12d", Integer.valueOf("400811837")).replace(" ", "0");
        System.out.println(str);

        String zeroForNum = addZeroForNum("400811837", 12);
        System.out.println(zeroForNum);
    }

    public static String addZeroForNum(String str, int strLength) {
        int strLen = str.length();
        if (strLen < strLength) {
            while (strLen < strLength) {
                StringBuffer sb = new StringBuffer();
                sb.append("0").append(str);//左补0
                // sb.append(str).append("0");//右补0
                str = sb.toString();
                strLen = str.length();
            }
        }
        return str;
    }
}
