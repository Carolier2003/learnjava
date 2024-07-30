package com.learn.test240714;

import java.io.*;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/14 13:20
 */
public class test1 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("CarolJava\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("CarolJava\\c.txt"));
        int b;
        while((b = bis.read())!=-1){
            bos.write(b);
        }
        bos.close();
        bis.close();
    }
}
