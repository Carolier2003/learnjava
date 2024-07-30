package com.learn.test240711;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/11 20:42
 */
public class test6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("CarolJava\\a.txt");
        int char1 = fis.read();
        System.out.println((char)char1);
        int char2 = fis.read();
        System.out.println((char)char2);
        int char3 = fis.read();
        System.out.println((char)char3);
        int char4 = fis.read();
        System.out.println((char)char4);
        int char5 = fis.read();
        System.out.println((char)char5);
        int char6 = fis.read();
        System.out.println((char)char6);
        fis.close();
    }
}
