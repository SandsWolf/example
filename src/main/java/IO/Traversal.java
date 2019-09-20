package IO;

import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.ArrayList;

import static java.lang.System.lineSeparator;
/*
      此方法用于逐行遍历文件内容，将包含指定字符串的行输出
 */

public class Traversal {
    @NotNull
    public static void txt2String(File file,String str) {
        StringBuffer result = new StringBuffer();
        try {

            //定义源文件输入流
            BufferedReader br = new BufferedReader(new FileReader(file));
            //定义输出流
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\qi.ma\\Desktop\\2.txt"));

            String s = null;
            //一次读取一行数据
            while ((s = br.readLine())!= null ) {
                //若数据中包含指定的字符串则输出
                if (s.contains(str)) {
                    bw.write(s);
                    bw.newLine();
                    bw.flush();
                }
            }

            br.close();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String args[]) {

        //需要提取的行匹配的字符串
        String str = "vehicleCode";
        //需要提取的文件的绝对的路径
        String filepath = "C:\\Users\\qi.ma\\Desktop\\new 3.txt";
        File file = new File(filepath);
        txt2String(file, str);
    }
}

