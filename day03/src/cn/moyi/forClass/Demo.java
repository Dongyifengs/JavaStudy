package cn.moyi.forClass;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        // 打印五次HelloWorld
        for (int i = 1; i <= 5; i++) {
            System.out.println("HelloWorld");
        }

        // 从1-100打印
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        /*// demo
        // for (int i = 1,j = 2;i < j; i++,j--) {
        //     System.out.println(i);
        //     System.out.println(j);
        // }*/

        Scanner sc = new Scanner(System.in);
        int ab = sc.nextInt();
        for (int o = ab; o <= 10; o++) {
            System.out.println("这是For里面的o" + o);
            ab = o;
        }
        System.out.println("这是For外面的AB" + ab);
    }
}
