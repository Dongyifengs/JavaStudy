package cn.moyi.part02;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int oneNum = sc.nextInt();
        System.out.println("请输入第二个整数");
        int twoNum = sc.nextInt();

        int result = (oneNum > twoNum)?oneNum:twoNum;
        System.out.println("最大值为:"+result);
    }
}
