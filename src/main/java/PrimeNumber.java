/*
题目：判断101-200之间有多少个素数，并输出所有素数。
程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，则表明此数不是素数，反之是素数。
素数概念：质数又称素数。一个大于1的自然数，除了1和它自身外，不能被其他自然数整除的数叫做质数
 */

public class PrimeNumber {
    public static void main(String args[]) {
        int m = 2;
        int n = 200;
        int count = 0;
        //统计素数个数
        for(int i=m;i<n;i++){
            if(isPrime(i)){
                count++;
                System.out.println(i);
                //每10个素数中间空行隔开
                if(count%10==0){
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.println("在"+m+"和"+n+"之间共有"+count+"个素数");
    }
    //判断是否是素数
    private static boolean isPrime(int n){
        boolean flag = true;
        if(n==1)
            flag = false;
        else{
            //为什么从2开始？？？？？ 因为素数计算需要遍历所有的除1外的自然数
            //下面的for循环为用n与小于n的自然数取模，存在模为0则n不是素数
            for(int i=2;i<=Math.sqrt(n);i++){
                if((n%i)==0){
                    flag = false;
                    break;
                }
                else
                    flag = true;
            }
        }
        return flag;
    }


}

