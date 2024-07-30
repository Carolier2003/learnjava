package com.learn.test240715;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/15 20:12
 */
public class test7 {
    public static void main(String[] args) throws IOException {
        File src = new File("D:\\aaa");
        File dst = new File(new File(src.getParent()), src.getName() + ".zip");
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dst));
        zipFile(src,zos,src.getName());
        zos.close();
    }

    public static void zipFile(File src, ZipOutputStream zos, String path) throws IOException {
        File[] files = src.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    ZipEntry ze = new ZipEntry(path + "\\" + file.getName());
                    zos.putNextEntry(ze);
                    FileInputStream fis = new FileInputStream(file);
                    int b;
                    while ((b = fis.read()) != -1) {
                        zos.write(b);
                    }
                    fis.close();
                    zos.closeEntry();
                }else{
                    file.mkdirs();
                    zipFile(file, zos, path + "\\" + file.getName());
                }
            }
        }
    }
}
