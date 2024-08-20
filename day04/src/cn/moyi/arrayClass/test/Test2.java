package cn.moyi.arrayClass.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        // 定义一个长度为10的int数组,要求用户使用键盘录入分别给数组的每个元素赋值,最后计算出该数组所有元素的总和,最大值,最小值,并且打印到控制台中.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("请输入10个整数:");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }

        // 计算总和
        int num = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            num = num + arr[i];
        }
        System.out.println("总和为:" + num);

        // 最大值
        int max = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最大为:" + max);

        // 最小值
        int min = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("最小为:" + min);

    }
}
