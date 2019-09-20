package IO;

import java.io.*;

public class CopyFile {
    public static  void main(String args[]) {
        String path = "C:\\Users\\qi.ma\\Desktop\\auto.log";
        copyFile(path);
    }

    private static void copyFile(String path) {

        StringBuffer stringBuffer = new StringBuffer(path);
        StringBuffer st = stringBuffer.insert(path.lastIndexOf("."), "副本");


        byte[] by = new byte[1024];
        int len = 0;

        try {

            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(st.toString()));
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));


            while ((len = bis.read(by)) != -1) {
                bos.write(by,0,len);
            }

            bis.close();
            bos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
