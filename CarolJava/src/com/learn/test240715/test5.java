package com.learn.test240715;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/15 16:43
 */
public class test5 {
    public static void main(String[] args) throws IOException {
        File src = new File("C:\\Users\\19667\\IdeaProjects\\CarolJava\\yasuo.zip");
        File dest = new File("D:\\aaa");
        unZip(src,dest);

    }

    public static void unZip(File src, File dest) throws IOException {
        ZipInputStream zis = new ZipInputStream(new FileInputStream(src));
        ZipEntry nextEntry;
        while ((nextEntry = zis.getNextEntry()) != null) {
            if (nextEntry.isDirectory()) {
                File f = new File(dest, nextEntry.getName());
                f.mkdirs();
            } else {
                FileOutputStream fos = new FileOutputStream(new File(dest, nextEntry.getName()));
                int b;
                while ((b = zis.read()) != -1) {
                    fos.write(b);
                }
                fos.close();
            }
            zis.closeEntry();
        }
        zis.close();
    }
}
