package cn.moyi.arrayClass.test;

public class Test4 {
    public static void main(String[] args) {
        int[] num = {171,72,19,16,118,51,210,7,18};

        // 求和
        int shu = 0;
        for (int j : num) {
            shu = shu + j;
            if (j < 100) {
                if (j / 7 == 0){
                    return;
                } else {
                    System.out.println("十位和个位不包含7的偶数:" + j);
                }
            }
        }
        System.out.println("总和L" + shu);
    }
}
