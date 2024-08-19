package cn.moyi.whileClass;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        // 让用户输入一个数字，如果不是-1就一直让用户输入，如果该数字为-1就结束循环
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("请输入一个数字");
            num = sc.nextInt();
        } while (num != -1);
    }
}
