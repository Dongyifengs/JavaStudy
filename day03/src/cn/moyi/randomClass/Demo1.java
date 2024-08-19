package cn.moyi.randomClass;

import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(10) + 1;
        System.out.println(num);
    }
}
