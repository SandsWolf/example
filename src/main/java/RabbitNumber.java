// 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
//本方法为递归，消耗性能，速度慢
public class RabbitNumber {
    public static void main(String[] args){
        int n=7;
        System.out.print(fun(n));
    }

    private static int fun(int n){
        if(n==1||n==2)
            return 1;
        else
            return fun(n-1)+fun(n-2);
    }
}