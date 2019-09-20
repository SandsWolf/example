/*#第二题
        #一个长街，每步上两阶，剩一阶；每步三阶，剩两阶；每步五阶，剩四阶；每步六阶，剩五阶；
        #上七阶刚好完
        #有多少阶

 分析:
    有x阶 则   x%2=1  x%3=2 x%5=4 x%6=5 x%7=0

 */
public class Math3 {
    public static void main(String[] args) {
        //每步上的阶数
        int[] arr = {2, 3, 5, 6, 7};
        //剩余的阶数
        int[] arr2 = {1, 2, 4, 5, 0};
        int i = 1;
        //while循环条件为true执行，条件为false跳出
        //a&&b   a，b同为true则true，一个为false则false
        //a||b   a,b一个为true则true，同为false则false
        while (!(((7 * i) % arr[0] == arr2[0]) && ((7 * i) % arr[1] == arr2[1]) && ((7 * i) % arr[2] == arr2[2]) && ((7 * i) % arr[3] == arr2[3]) && ((7 * i) % arr[4] == arr2[4]))) {
            i++;
        }
        System.out.println(7*i);

    }
}