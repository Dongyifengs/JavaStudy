package cn.moyi.part02;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(1+2); //3
        System.out.println(1-2); //-1
        System.out.println(0x1 *2); //2
        System.out.println(1/2); //0
        System.out.println(10%4); //2
        System.out.println("==================");


        char c = 'A';
        System.out.println(c+0);
        char c2 = (char) (c+1);
        System.out.println(c2);
        System.out.println("==================");


        System.out.println("测试"+c2+"测试");

    }
}
