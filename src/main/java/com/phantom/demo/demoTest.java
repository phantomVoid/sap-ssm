package com.phantom.demo;

public class demoTest {
    public static void printHeart(){
        for (int i = 0, k = 0; i < 14; i++) {// 打印行

            // 上部分 上分为 四个部分
            if (i < 3) {
                // 1、空心
                for (int j = 0; j < 5 - 2 * i; j++) {
                    System.out.print(" ");
                }
                // 2、*
                if (i == 2) {
                    for (int j = 0; j < 6 + 4 * i - 1; j++) {
                        System.out.print("\033[31;0m"+"*"+"\033[0m");
                    }
                    // 3、空心
                    for (int j = 0; j < 7 - 4 * i + 2; j++) {
                        System.out.print(" ");
                    }
                    // 4、*
                    for (int j = 0; j < 6 + 4 * i - 1; j++) {
                        System.out.print("\033[31;0m"+"*"+"\033[0m");
                    }
                } else {
                    // 2、*
                    for (int j = 0; j < 6 + 4 * i; j++) {
                        System.out.print("\033[31;0m"+"*"+"\033[0m");
                    }
                    // 3、空心
                    for (int j = 0; j < 7 - 4 * i; j++) {
                        System.out.print(" ");
                    }
                    // 4、*
                    for (int j = 0; j < 6 + 4 * i; j++) {
                        System.out.print("\033[31;0m"+"*"+"\033[0m");
                    }
                }
                // 中间
            } else if (i < 6) {
                for (int j = 0; j < 29; j++) {
                    System.out.print("\033[31;0m"+"*"+"\033[0m");
                }
                // 下部分 6
            } else {
                if (i == 13) {
                    // 打印空格
                    for (int j = 0; j < 2 * (i - 6); j++) {
                        System.out.print(" ");
                    }
                    System.out.print("\033[31;0m"+"*"+"\033[0m");
                } else {
                    // 打印空格
                    for (int j = 0; j < 2 * (i - 6) + 1; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j < 28 - 4 * k; j++) {
                        System.out.print("\033[31;0m"+"*"+"\033[0m");
                    }
                    k++;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printHeart();
        System.out.println("          教师节快乐");
    }
}
