package com.learn.test240713;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/13 19:25
 */
public class test3 {
    public static void main(String[] args) throws IOException {
        File src = new File("D:\\aaa");
        File dest = new File("E:\\aaa");

        copyDir(src, dest);
    }

    private static void copyDir(File src, File dest) throws IOException {
        dest.mkdirs();
        File[] files = src.listFiles();
        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName());
                if (file.isDirectory()) {
                    copyDir(file, new File(dest, file.getName()));
                } else {
                    FileInputStream fis = new FileInputStream(file);
                    FileOutputStream fos = new FileOutputStream(new File(dest, file.getName()));

                    byte[] b = new byte[1024 * 1024 * 5];
                    int len;
                    while((len = fis.read(b))!=-1){
                        fos.write(b,0,len);
                    }

                    fos.close();
                    fis.close();
                }
            }
        }
    }
}
