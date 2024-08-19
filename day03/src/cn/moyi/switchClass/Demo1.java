package cn.moyi.switchClass;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int num = cs.nextInt();
        switch (num) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
