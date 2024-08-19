package cn.moyi.whileClass;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        // 让用户输入一个数字，如果不是-1就一直让用户输入，如果该数字为-1就结束循环
        Scanner sc = new Scanner(System.in);
        int num = 0;

        while (num != -1) {
            System.out.println("请输入一个数字");
            num = sc.nextInt();
        }

    }
}
