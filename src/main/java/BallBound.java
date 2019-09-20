/*
题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
分析：
 */

import java.util.Scanner;

public class BallBound {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入落地高度：");
        int h = in.nextInt();
        System.out.println("请输入落地次数：");
        int t = in.nextInt();
        System.out.print("第"+t+"次落地时，共经过"+length(h,t)+"米，第"+t+"次反弹"+bound(h, t)+"米");


    }
    private static double bound(double high, double times) {
        high = high/Math.pow(2,times);
        return high;
    }

    // 总路程规律为 第N次下落总距离比第N-1次下落增加了第N-1次的下落高度
    private static double length(int high, int times) {
        double length = high;
        for (int i=0;i<times-1;i++){
            length += high/Math.pow(2,i);
        }
        return length;
    }

}
