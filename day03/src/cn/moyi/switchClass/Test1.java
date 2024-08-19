package cn.moyi.switchClass;

import java.util.Scanner;

public class Test1 {
    // 键盘输入0-6，分别代表周日，周一，，，，
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入0-6之间的整数");
        int week = sc.nextInt();
        switch (week) {
            case 0:
                System.out.println("0代表周日");
                break;
            case 1:
                System.out.println("1代表周一");
                break;
            case 2:
                System.out.println("2代表周二");
                break;
            case 3:
                System.out.println("3代表周三");
                break;
            case 4:
                System.out.println("4代表周四");
                break;
            case 5:
                System.out.println("5代表周五");
                break;
            case 6:
                System.out.println("6代表周六");
                break;
            default:
                System.out.println("你输入了非法数字");
                break;
        }
    }
}
