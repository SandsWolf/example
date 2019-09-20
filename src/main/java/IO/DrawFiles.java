package IO;/*
按文档结构从文档中提取指定后缀的文件集合
 */

import java.io.*;

public class DrawFiles {
    public static void main(String args[]) throws IOException {
        File srcFile = new File("E:\\传智播客_2015年Java基础视频-深入浅出精华版");
        File destFile = new File("D:\\IdeaProjects\\example\\src\\test\\DrawFilesResult");
        drawFolder(srcFile, destFile);
    }

    private static void drawFolder(File srcFile, File destFile) throws IOException {

        //目标文件夹是否存在，不存在则创建
        if (!destFile.exists()) {
            destFile.mkdir();
        }


        File[] folder = srcFile.listFiles();
        //遍历源文件下内容
        for (File newFile : folder) {
            //若为文件夹，则将此文件夹设为源问件，更新目标文件，再次调用 drawFolder(srcFile, destFile)方法

            if (newFile.isDirectory()) {
                File newDestFile = new File(destFile.getPath() + "\\" + newFile.getName());
                drawFolder(newFile, newDestFile);
            //若为“.java”结尾文件，则从源文件读出，写入目标文件
            } else if (newFile.isFile() && newFile.getName().endsWith(".java")) {

                drawFile(newFile,destFile);

            }
        }
    }

    public static void drawFile(File newFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(newFile.getPath()));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile.getPath() + "\\" + newFile.getName()));

        int len = 0;
        byte[] by = new byte[1024];
        while ((len = bis.read(by)) != -1) {
            bos.write(by, 0, len);
        }

        bis.close();
        bos.close();
    }
}
