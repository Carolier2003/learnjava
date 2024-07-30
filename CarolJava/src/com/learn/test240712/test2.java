package com.learn.test240712;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/12 14:49
 */
public class test2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("CarolJava\\a.txt");
        FileOutputStream fos = new FileOutputStream("CarolJava\\b.txt");
        byte[] buf = new byte[1024];
        int len = 0;
        long start = System.currentTimeMillis();
        while((len = fis.read(buf))!=-1){
            fos.write(buf,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        fos.close();
        fis.close();
    }
}
