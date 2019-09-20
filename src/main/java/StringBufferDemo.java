/*
    StringBuffer类的数据类型转换等练习
 */

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();

        //StringBuffer 拼参 append();
        stringBuffer.append("Hello");

        System.out.println(stringBuffer);

        System.out.println("--------------");

        stringBuffer.append("World");

        System.out.println(stringBuffer);

        //StringBuffer 输出长度 length();
        System.out.println(stringBuffer.length());

        //StringBuffer 输出指定位置的字符 charAt();
        System.out.println(stringBuffer.charAt(5));

        //StringBuffer 输出容量 capacity();
        System.out.println(stringBuffer.capacity());

        System.out.println(stringBuffer.toString());

        System.out.println(stringBuffer.insert(5,"321"));

        //输入制定字符串第一次出现的位置索引
        System.out.println(stringBuffer.indexOf("W",1));

        //删除指定位置的字符串
        System.out.println(stringBuffer.delete(8,9));

    }
}

