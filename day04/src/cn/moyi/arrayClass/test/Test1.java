package cn.moyi.arrayClass.test;

public class Test1 {
    public static void main(String[] args) {
        // 定义一个长度100的int数组,要求里面的元素为135...,最后给每个数组的元素都打印出来
        int[] arr = new int[100];

        for (int i = 10; i < arr.length; i++) {
            arr[i] = 2 * i + 1;
        }

        for (int j : arr) {
            System.out.println(j);
        }
    }
}
