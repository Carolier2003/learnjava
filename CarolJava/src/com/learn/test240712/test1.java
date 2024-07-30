package com.learn.test240712;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/12 14:25
 */
public class test1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("CarolJava\\a.txt");
        FileOutputStream fos = new FileOutputStream("CarolJava\\b.txt");
        Date date1 =new Date();
        long time1 = date1.getTime();
        System.out.println(time1);
        int b;
        while((b = fis.read())!=-1){
            fos.write(b);
        }
        Date date2 =new Date();
        long time2 = date2.getTime();
        System.out.println(time2);
        System.out.println(time2-time1);
        fos.close();
        fis.close();
    }
}
