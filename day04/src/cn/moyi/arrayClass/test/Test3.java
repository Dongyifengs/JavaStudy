package cn.moyi.arrayClass.test;

public class Test3 {
    public static void main(String[] args) {
        // 定义2个长度为5大的字符串数组arrA和arrB,arrA包含元素{"1","2","3","4","5"},arrB中所有元素按照逆序存储到arrB中

        String[] arrA = {"1","2","3","4","5"};
        String[] arrB = new String[5];

        for (int i = 0; i < arrB.length; i++) {
            arrB[i] = arrA[arrA.length-1-i];
        }

        for (int i = 0; i < arrB.length; i++) {
            System.out.println(arrB[i]);
        }

    }
}
