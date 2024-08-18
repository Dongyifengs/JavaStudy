package cn.moyi.part01;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        // System.in 控制台输入流
        Scanner sc = new Scanner(System.in);
        // 录入一个整数
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        // 输出结果
        System.out.println(num);
    }
}
