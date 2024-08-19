package cn.moyi.ifClass;

public class Test6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        if (a % 2 == 0) {
            b = 0;
        } else if (a % 2 == 1) {
            b = 1;
        }
        System.out.println(b);
    }
}
