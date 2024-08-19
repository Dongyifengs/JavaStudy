package cn.moyi.ifClass;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        // 输入年龄是否可以进入网吧
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的年龄");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("已成年，可以进入网吧");
        } else {
            System.out.println("未成年，不可以进入网吧");
        }
    }

}
