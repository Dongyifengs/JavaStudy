package cn.moyi.part02;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // 尝试定义3个变量分别为语文数学英语的分数
        // 使用键盘输入的方式让用户对应的分数，然后去打印总分和平均分
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的语文分数：");
        int chineseScore = sc.nextInt();
        System.out.println("请输入你的数学分数：");
        int mathScore = sc.nextInt();
        System.out.println("请输入你的英语分数：");
        int englishScore = sc.nextInt();

        int score = chineseScore + mathScore + englishScore;
        float average = score / 3f;
        System.out.println("你的语文分数为：" + chineseScore);
        System.out.println("你的数学分数为：" + mathScore);
        System.out.println("你的英语分数为：" + englishScore);
        System.out.println("你的总分数为：" + score);
        System.out.println("你的平均分数为：" + average);

    }
}
