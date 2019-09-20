import java.util.Scanner;

/*
题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
程序分析：(a>b)?a:b这是条件运算符的基本例子。
 */
public class ClassificationScore {
    public static void main(String args[]){
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入成绩");
        n = in.nextInt();
        grade(n);
    }
    private static void grade(int n){
        if(n>100||n<0)
            System.out.println("输入无效");
        else{
            //(a>b)?x:(a>c)?y:z
            String str = (n>=90)?"分，属于A等":((n>=60)?"分，属于B等":"分，属于C等");
            System.out.println(n+str);
        }
    }
}
