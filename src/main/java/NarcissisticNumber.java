/*
题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
 */
public class NarcissisticNumber {
    public static void main(String args[]) {
        for (int i = 100; i < 1000; i++) {
            if (isLotus(i))
                System.out.println("水仙花数"+i);
        }

    }
        private static boolean isLotus(int lotus){
           int m = 0;
           int n = lotus;
           int sum = 0;
           //得出百位数
           m = n/100;
           //减去百位，得到剩余两位数
           n -= m*100;
           //得出百位的立方
           sum = m*m*m;
           //得出十位数
           m = n/10;
           //减去十位数，得到个位数
           n -= m*10;
           //百位立方、十位立方、个位立方求和，得到水仙花数
           sum += m*m*m + n*n*n;

           if (sum==lotus)
               return true;
           else
               return false;

        }

}


