package cn.moyi.switchClass;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个1-12的月份");
        int month = sc.nextInt();
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("是春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("是夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("是秋天");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("是冬天");
                break;
            default:
                System.out.println("请输入正确的数字");
                break;
        }
    }
}
