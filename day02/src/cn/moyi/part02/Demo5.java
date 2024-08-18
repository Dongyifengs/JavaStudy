package cn.moyi.part02;

public class Demo5 {
    public static void main(String[] args) {
        /*int a = 15;
        System.out.println();*/

        // 与
        System.out.println(true&true); //true
        System.out.println(true&false); // false
        System.out.println("=============================");

        // 或
        System.out.println(true|false); // true
        System.out.println(true|true); // true
        System.out.println(false|false); // false
        System.out.println("=============================");

        // 异或
        System.out.println(true^false); // true
        System.out.println(false^true); // true
        System.out.println(true^true); // false
        System.out.println(false^false); // false
        System.out.println("=============================");

        // 非
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println("=============================");

        // 短路与
        int x = 10;
        int y = 15;
        // System.out.println((x++ > 4) | (y++ > 5));
        System.out.println((x++ > 4) || (y++ > 5));
        System.out.println(x);
        System.out.println(y);
        System.out.println("=============================");

        // 短路或

        System.out.println("=============================");
    }
}
