package cn.moyi.arrayClass.test;

public class Demo6 {
    public static void main(String[] args) {
        // 前两个月都是1,第三个月开始 兔子对数= 前两个月对数之和
        // 定义一个数组
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[arr.length - 1]);
    }
}
