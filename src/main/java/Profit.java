import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

/*
题目：企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；利润高于10万元，低于20万元时，
    低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；20万到40万之间时，高于20万元的部分，可
    提成5%；40万到60万之间时高于40万元的部分，可提成3%；60万到100万之间时，高于60万元的部分，可提成1.5%
    ，高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数？
程序分析：请利用数轴来分界，定位。注意定义时需把奖金定义成长整型。

 */
public class Profit {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入利润金额：");
        long i = in.nextLong();
        String result = Profit(i);
        System.out.println(result);

    }
    @NotNull
    @Contract(pure = true)
    private static String Profit(long i){
        double reward = 0;
        if (i>1000000){
            i -= 1000000;
            reward += i*0.01;
            i = 1000000;
        }
        if (i>600000){
            i -= 600000;
            reward += i*0.015;
            i = 600000;

        }
        if (i>400000){
            i -= 400000;
            reward += i*0.03;
            i = 400000;

        }
        if (i>200000){
            i -= 200000;
            reward += i*0.05;
            i = 200000;

        }
        if (i>100000){
            i -= 100000;
            reward += i*0.075;
            i = 100000;

        }
        reward += i*0.1;

        return "奖金为"+reward;

    }
}
