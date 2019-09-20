

import java.util.Scanner;

public class Math2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in).useDelimiter("\\s*");//以空格作为分隔符
        System.out.print("求s=a+aa+aaa+aaaa+...的值，请输入a的值：");
        int a = scan.nextInt();
        System.out.print("请输入n的值：");
        int n = scan.nextInt();
        scan.close();//关闭扫描器
        System.out.println(expressed(a,n)+add(a,n));
    }
    //求和表达式
    private static String expressed(int a, int n){
        StringBuffer sb = new StringBuffer();
        StringBuffer subSB = new StringBuffer();
        for(int i=1;i<n+1;i++){
            subSB = subSB.append(a);
            sb = sb.append(subSB);
            if(i<n)
                sb = sb.append("+");
        }
        sb.append("=");
        return sb.toString();
    }
    //求和
    private static long add(int a, int n){
        long sum = 0;
        long subSUM = 0;
        for(int i=1;i<n+1;i++){
            subSUM = subSUM*10+a;
            sum = sum+subSUM;
        }
        return sum;
    }
}
