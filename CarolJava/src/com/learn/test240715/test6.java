package com.learn.test240715;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/15 17:12
 */
public class test6 {
    public static void main(String[] args) throws IOException {
        File src = new File("D:\\a.txt");
        File dest = new File("D:\\");

        toZip(src,dest);
    }

    public static void toZip(File src, File dest) throws IOException {
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest, "a.zip")));
        zos.putNextEntry(new ZipEntry("a.txt"));
        FileInputStream fis = new FileInputStream(src);
        byte[] buffer = new byte[1024];
        int length;
        while ((length = fis.read(buffer)) > 0) {
            zos.write(buffer, 0, length);
        }
        zos.closeEntry();
        fis.close();
        zos.close();
    }

}
