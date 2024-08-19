package cn.moyi.ifClass;

import java.util.Scanner;

public class Test3 {
    // 让用户输入语文，数学，英语的考试成绩 如果总分小于180分输出：由于你很优秀i，我先和你家长聊聊，否则输出：同九义，何汝秀
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入语文的成绩");
        double chineseScores = sc.nextDouble();
        System.out.println("请输入数学的成绩");
        double mathScores = sc.nextDouble();
        System.out.println("请输入英语的成绩");
        double englishScores = sc.nextDouble();

        // 计算相关数值
        double score = chineseScores + mathScores + englishScores;
        double averageScore = score / 3;

        // 输出你的成绩
        System.out.println("你的语文成绩是："+ chineseScores);
        System.out.println("你的数学成绩是："+ mathScores);
        System.out.println("你的英语成绩是："+ englishScores);
        System.out.println("你的总分是：" + score);
        System.out.println("你的平均分是：" + averageScore);

        // 判断
        if (score < 180) {
            System.out.println("你的成绩很优秀，我想找你的家长聊一聊。");
        } else if (score >= 180 && chineseScores > 98 && mathScores > 98 && englishScores > 98) {
            System.out.println("恭喜升任五道杠大队长");
        } else if (score >= 180 && chineseScores > 95 && mathScores > 95 && englishScores > 95) {
            System.out.println("恭喜升级班长");
        } else {
            System.out.println("同九义，何汝秀");
        }
    }
}
