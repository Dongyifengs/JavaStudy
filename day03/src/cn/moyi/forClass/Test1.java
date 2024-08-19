package cn.moyi.forClass;

public class Test1 {
    public static void main(String[] args) {
        // 输出1-100的所有数字
        // for (int i = 1; i <= 100; i++) {
        //     System.out.println(i);
        // }

        // 输出100-1的所有数字
        // for (int i = 100; i >= 1; i--) {
        //     System.out.println(i);
        // }

        // 要求求出1-100的所有和
        // int b = 0;
        // for (int i = 1; i <= 100; i++) {
        //     b = b + i;
        // }
        // System.out.println(b);

        // 1-100的偶数和
        // int b = 0;
        // for (int i = 2; i <= 100; i+=2) {
        //     b = b + i;
        // }
        // System.out.println(b);

        // 1-100中一能被3整除，又能被5整除的数有多少个
        int b = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                b = b + 1;
            }
        }
        System.out.println(b);
    }
}
