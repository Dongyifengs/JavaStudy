package cn.moyi.part02;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a>b); // false
        System.out.println(a<b); // true
        System.out.println(10>=9); // true
        System.out.println(10<=9); // false
        System.out.println(10==10); // true
        System.out.println(10!=10); // false
    }
}
