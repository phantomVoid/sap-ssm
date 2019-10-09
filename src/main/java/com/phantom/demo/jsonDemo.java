package com.phantom.demo;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class jsonDemo {
    public static void main(String[] args) {
//        String str = String.format("%12d", Integer.valueOf("400811837")).replace(" ", "0");
//        System.out.println(str);
//
//        String zeroForNum = addZeroForNum("400811837", 12);
//        System.out.println(zeroForNum);

//        String sn = "SGI101$191003001";
//        String sn1 = "SGI101$191003001$11.2";
//        String sn2 = "SGI101";
//
//        String[] split = sn.split("\\$");
//        String[] split1 = sn1.split("\\$");
//        String[] split2 = sn2.split("\\$");
//
//        doSplit(split);
//
//        doSplit(split1);
//
//        doSplit(split2);

        List<String> a = new ArrayList<>();
        List<String> b = new ArrayList<>();

        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");
        a.add("5");
        a.add("6");

        b.add("1");
        b.add("3");

        List<String> reduce2 = a.stream().filter(item -> !b.contains(item)).collect(toList());
        System.out.println("---差集 reduce2 (list2 - list1)---");

        reduce2.parallelStream().forEach(System.out :: print);

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

    public static void doSplit(String[] split1){
        System.out.println("---------------");
        int length = split1.length;
        System.out.println("length: >>> ");
        System.out.println(length);

        for (String s : split1) {
            System.out.println(s);
        }
    }
}
