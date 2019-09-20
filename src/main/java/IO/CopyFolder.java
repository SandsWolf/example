package IO;

import java.io.*;

public class CopyFolder {
    public static void main(String args[]) throws IOException {

        String src = "E:\\传智播客_2015年Java基础视频-深入浅出精华版";
        String result = "C:\\Users\\qi.ma\\Desktop\\提取图片";

        File srcFolder = new File(src);
        File destFolder = new File(result);

        destFolder.mkdir();
        copyFolder(srcFolder, destFolder);

    }

    private static void copyFolder(File srcFolder, File destFolder) throws IOException {


        File[] files = srcFolder.listFiles();

        for (File folder : files) {
            if (folder.isDirectory()) {
                srcFolder = folder;
                copyFolder(srcFolder, destFolder);
            } else if (folder.isFile() && folder.getName().endsWith(".java")) {
                srcFolder = folder;
                File newFile = new File(destFolder, srcFolder.getName());
                copyFile(srcFolder, newFile);
            }
        }

    }

    private static void copyFile(File srcFolder, File destFolder) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFolder));
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFolder));

        int len = 0;
        byte[] by = new byte[1024];
        while ((len = bis.read(by)) != -1) {
            bos.write(by, 0, len);
        }
        bos.close();
        bis.close();
    }


}








