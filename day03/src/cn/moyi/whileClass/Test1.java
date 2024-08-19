package cn.moyi.whileClass;

import org.w3c.dom.xpath.XPathResult;

public class Test1 {
    public static void main(String[] args) {
        // 1.获取10-99 的总和与偶数个数
        // int b = 0;
        // int c = 0;
        // for (int i = 10; i <= 99; i++) {
        //     b = b + i;
        //     if (i % 2 == 0) {
        //         c++;
        //     }
        // }
        // System.out.println("总和" + b);
        // System.out.println("偶数个数" + c);

        // 2.某个山高8848m， 我有纸，厚度0.01m，我折几次可以比山高？
        // double mountain = 8848.00;
        // double paper = 0.01;
        // int c = 0;
        // for (int i = c;paper < mountain;i++) {
        //     paper = paper + paper;
        //     c = i;
        // }
        // c += 1;
        // System.out.println(c);
        // double h = 0.01;
        // int count = 0;
        // while (h < 8848) {
        //     h = h * 2;
        //     count++;
        // }
        // System.out.println("折叠的次数" + count);

        // 计算1x2x3x4....x8
        // int i = 1;
        // int c = 1;
        // while (i <= 8) {
        //     c = i * c;
        //     i++;
        // }
        // System.out.println(c);
        // int b = 1;
        // for (int i = 1; i <= 8; i++) {
        //     b = i * b;
        // }
        // System.out.println(b);

        // 打印金字塔
        // for (int i = 1; i <= 3; i++) {
        //     for (int j = 1; j <= 3-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int k = 1; k <= (2*i-1); k++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j + "*" + i + "=" + (j*i) + "\t");
            }
            System.out.println();
        }
    }
}
