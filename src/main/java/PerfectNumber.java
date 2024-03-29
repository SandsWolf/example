/*
题目：一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程找出1000以内的所有完数。
 */
public class PerfectNumber {
    public static void main(String[] args){
        int n = 1000;
        compNumber(n);
    }
    //求完数
    private static void compNumber(int n){
        System.out.println(n+"以内的完数：");
        for(int i=1;i<n+1;i++){
            int sum = 0;
            for(int j=1;j<i/2+1;j++){
                if((i%j)==0){
                    sum += j;
                    }
                }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}

