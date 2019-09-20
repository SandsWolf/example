package IO;

import java.io.*;

public class ModifyFiles  {
    public static void main(String args[])  throws IOException {
        //文件路径
        File floder = new File("C:\\Users\\qi.ma\\Desktop\\提取图片");
        modifyFiles(floder);
    }

    private static void modifyFiles(File floder) throws IOException {

        File[] files = floder.listFiles();
        for (File file : files) {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"GBK"));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\IdeaProjects\\example\\src\\test\\chuanzhiboke\\" + file.getName()),"GBK"));

            String line = null;
            while ((line = br.readLine()) != null) {
                if (!line.contains("package")){
                    bw.write(line);
                    bw.newLine();
                    bw.flush();
                }
            }
            bw.close();
            br.close();

        }
    }
}
