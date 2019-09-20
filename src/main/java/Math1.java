import java.util.Scanner;

/*
题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
程序分析：关键是计算出每一项的值。
 */
public class Math1 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.println("请输入a的值：");
        int a = in.nextInt();
        System.out.println("请输入n的值：");
        int n = in.nextInt();
        fun(a,n);
    }

    private static void fun(int a,int n){
        int sum = a;
        int sumValue = 0;

        for (int i=1;i<=n;i++){
            double value = java.lang.Math.pow(10,i)*a;
            if (i==n){
                System.out.print(sum);
            }
            else{
                System.out.print(sum+"+");
            }
            sumValue += sum;
            sum += value;
        }
        System.out.print("="+sumValue);
    }

}
