package cn.moyi.arrayClass;

public class Demo3 {
    public static void main(String[] args) {
        int num = 11;
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        int[] arr2 = arr;
        arr2[2] = 3;
        arr2[3] = 4;
        System.out.println(arr2[0]);
        System.out.println(arr[3]);
    }
}
