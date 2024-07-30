package com.learn.test240711;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/11 21:57
 */
public class test7 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("CarolJava\\a.txt");
        int b;
        while((b = fis.read())!=-1){
            System.out.print((char)b);
        }
        fis.close();
    }
}
