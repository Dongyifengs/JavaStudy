package cn.moyi.part02;

import java.util.Scanner;

public class Test61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int oneNum = sc.nextInt();
        System.out.println("请输入第二个数字");
        int twoNum = sc.nextInt();
        System.out.println("请输入第三个数字");
        int threeNum = sc.nextInt();

        int result = (oneNum > twoNum)?oneNum:(twoNum > threeNum)?twoNum:(threeNum > oneNum)?threeNum:oneNum;
        System.out.println(result);
    }
}
