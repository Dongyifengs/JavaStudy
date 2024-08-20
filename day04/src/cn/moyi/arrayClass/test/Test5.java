package cn.moyi.arrayClass.test;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {5,7,3,14,42};
        // no1
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println();
        // no2
        for (int i = 0; i < arr.length - 1 - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println();

        // no2
        for (int i = 0; i < arr.length - 1 - 1 - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println();
    }
}
