import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入要画的三角形行数：");
        int n = in.nextInt();
        draw(n);
        draw2(n);
        draw3(n);
        draw4(n);
    }
    private static void draw(int n){
        //从第一行开始画，画到第N行
        System.out.println("正三角");
        for(int i=1;i<=n;i++){
            //每行的空格数为总行数-当前行数
            for(int m=n;m>=i+1;m--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            //每行画完后换行
            System.out.println();
        }
    }
    private static void draw2(int n){
        System.out.println("倒三角");
        for(int i=1;i<=n;i++){
            for (int a=1;a<i;a++){
                System.out.print(" ");
            }
            for (int b=2*n;b>=2*i;b--){
                System.out.print("*");
            }

            //每行画完后换行
            System.out.println();
        }
    }
    private static void draw3(int n){
        System.out.println("菱形");
        for(int i=1;i<n;i++){
            //每行的空格数为总行数-当前行数
            for(int m=n;m>=i+1;m--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            //每行画完后换行
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for (int c=1;c<i;c++){
                System.out.print(" ");
            }
            for (int d=2*n;d>=2*i;d--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void draw4(int n){
        System.out.println("空心菱形");
        for(int i=1;i<=n-1;i++){
            for(int e=n;e>=i+1;e--){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int f=1;f<2*i-2;f++){
                System.out.print(" ");
            }
            if (i==1){
                System.out.println();
            }
            else{
                System.out.println("*");
            }

        }
        for(int i=1;i<=n;i++){
            for(int g=1;g<i;g++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int h=2*n-3;h>=2*i-1;h--){
                System.out.print(" ");
            }
            if(i==n){
                System.out.println("");
            }
            else{
                System.out.println("*");
            }
        }

    }
}
