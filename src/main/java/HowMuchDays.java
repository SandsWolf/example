import java.util.Random;
import java.util.Scanner;

/*
题目：输入某年某月某日，判断这一天是这一年的第几天？
程序分析：以3月5日为例，应该先把前两个月的加起来，然后再加上5天即本年的第几天，特殊情况，闰年且输入月份大于3时需考虑多加一天。

 */
public class HowMuchDays {
    public static void main(String args[]){


        Scanner in = new Scanner(System.in).useDelimiter("\\D");
        System.out.print("请输入当前日期（年-月-日）:");
        int year = in.nextInt();
        int month = in.nextInt();
        int day = in.nextInt();
        in.close();
        int result = days(year,month,day);
        System.out.println("这天是这年的第"+result+"天");


    }
    private static int days(int year,int month,int day){
        int days = 0;
        int arry[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        if ((year%400==0||year%4==0)&&year%100!=0){
            arry[1]=29;
        }
        for (int i=0;i<month-1;i++){
            days += arry[i];
        }
        days += day;

        return days;
    }



}
