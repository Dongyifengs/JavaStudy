package cn.moyi;

public class Test3 {
    public static void main(String[] args) {
        // 变量有其作用范围，他的作用范围是定义它的那行代码所在的大括号内。
        // 在同一个大括号中定义的变量名不能重复
        // 变量在使用之前必须要初始化（赋值）
        // 定义long类型的变量，需要在证书的后面加L（大小写均可，建议大写）。因为整数默认是int类型
        // 加L详单与告诉计算机这个整数很特殊是long类型的。定义float类型的变更时，需要在小数的后面加F（大小写均可。建议大写）
        // 因为浮点数的默认类型是double，加F相当于告诉计算机这个小数是float类型的

        {
            int num = 10;
            // double num1 = 10;
            System.out.println(num);
        }
        int num2;
        num2 = 123;
        System.out.println(num2);
        // System.out.println(num);

        long l = 10000000000L;
        float f = 3.14F;
    }
}
