/*
借助Scanner 读取字符串数据，然后用格式化输出下面

浙江温州最大皮革厂江南皮革厂倒闭了，王八蛋老板黄鹤吃喝嫖赌，欠下了3.5个亿，
带着他的小姨子跑了!我们没有办法，拿着钱包抵工资!原价都是一百多、两百多、三百多的钱包，
现在全部只卖二十块，统统只要二十块!黄鹤王八蛋，你不是人!我们辛辛苦苦给你干了大半年，
你不发工资，你还我血汗钱，还我血汗钱!
 */

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        System.out.println("请输入城市：例如深圳");
        String a = string.next();
        System.out.println("请输入公司类型：例如互联网");
        String b = string.next();
        System.out.println("请输入公司名称：例如百度");
        String c = string.next();
        System.out.println("请输入BOSS名字：例如李彦宏");
        String d = string.next();
        System.out.println("请输入金额：15");
        String e = string.next();
        System.out.println("请输入物品：例如代码");
        String f = string.next();

        String text = "%s最大%s公司%s倒闭了，王八蛋老板%s吃喝嫖赌，欠下了%s个亿，\n" +
                "带着他的小姨子跑了!我们没有办法，拿着%s抵工资!原价都是一百多、两百多、三百多的%s，\n" +
                "现在全部只卖二十块，统统只要二十块!黄鹤王八蛋，你不是人!我们辛辛苦苦给你干了大半年，\n" +
                "你不发工资，你还我血汗钱，还我血汗钱!";

        System.out.format(text,a,b,c,d,e,f,f);

    }
}
