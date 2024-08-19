package cn.moyi.switchClass;

import java.util.Scanner;

public class ProMax {
    public static void main(String[] args) {
        // 变量season表示季节，他可以为春、夏、秋、冬的字符串，现在需要输入一个月份，并自动改变这个变量的值，使用switch case 实现
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入1-12的一个月份");
        int month = sc.nextInt();
        String season = switch (month){
            case 3,4,5 -> "春天";
            case 6,7,8 -> "夏天";
            case 9,10,11 -> "秋天";
            case 12,1,2 -> "冬天";
            default -> "错误";
        };
        System.out.println(season);
    }
}
