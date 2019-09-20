package IO;


import java.io.*;
/*
      此方法用于逐行遍历文件内容，将包含指定字符串的行输出
 */

public class TraversalList {
    public static void txt2String(File file,File fileFrist) {
        StringBuffer result = new StringBuffer();
        try {

            //定义被匹配文件输入流
            BufferedReader br = new BufferedReader(new FileReader(file));

            //定义输出流
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\qi.ma\\Desktop\\1.txt"));

            String s = null;
            String a = null;

            //一次读取一行数据
            while ((s = br.readLine())!= null ) {

                //定义需匹配文件输入流
                BufferedReader br1 = new BufferedReader(new FileReader(fileFrist));

                //若数据中包含指定的字符串则输出
                while((a = br1.readLine())!= null) {
                    if (s.contains(a)) {
                        bw.write(s);
                        bw.newLine();
                        bw.flush();
                    }
                }

                br1.close();
            }

            br.close();
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String args[]) {

        //需要提取的行匹配的字符串的列表文件路径
        String filepathFrist = "C:\\Users\\qi.ma\\Desktop\\new 4.txt";
        File fileFrist = new File(filepathFrist);
        //需要提取的文件的绝对的路径
        String filepath = "D:\\tools\\mysql\\mysql-8.0.15-winx64\\README";
        File file = new File(filepath);
        txt2String(file, fileFrist);
    }
}

