import java.util.Scanner;

/*
题目：输入三个整数x,y,z，请把这三个数由小到大输出。
程序分析：我们想办法把最小的数放到x上，先将x与y进行比较，如果x>y则将x与y的值进行交换，然后再用x与z进行比较，如果x>z则将x与z的值进行交换，这样能使x最小。

 */
public class Bubble {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int x= in.nextInt();
        System.out.println("请输入第二个数：");
        int y= in.nextInt();
        System.out.println("请输入第三个数：");
        int z= in.nextInt();

        System.out.println("排序结果"+bubble(x,y,z));

    }
    private static String bubble(int x,int y,int z){
        if (x>y){
           int temp = x;
           x = y;
           y = temp;
        }
        if (x>z){
            int temp = x;
            x = z;
            z = temp;

        }
        if (y>z){
            int temp = y;
            y = z;
            z = temp;
        }
        return x+"<"+y+"<"+z;
    }
}
