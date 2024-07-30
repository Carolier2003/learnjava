package com.learn.test240714;

import java.io.*;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/14 13:40
 */
public class test2 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("CarolJava\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("CarolJava\\b.txt"));
        byte[] bytes = new byte[1024];
        int len;
        while((len = bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();
    }
}
