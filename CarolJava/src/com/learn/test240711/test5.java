package com.learn.test240711;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/11 20:27
 */
public class test5 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("CarolJava\\a.txt");
        String str1 = "jianjialezuishuai";
        byte[] bytes1 = str1.getBytes();
        fos.write(bytes1);

        String str2 = "\r\n";
        fos.write(str2.getBytes());

        String str3 = "666";
        byte[] bytes2 = str3.getBytes();
        fos.write(bytes2);

        fos.close();
    }
}
