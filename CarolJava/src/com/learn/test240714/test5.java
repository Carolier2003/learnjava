package com.learn.test240714;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/14 14:57
 */
public class test5 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\aaa\\src\\[ANi] 【我推的孩子】 - 13 [1080P][Baha][WEB-DL][AAC AVC][CHT].mp4");
        FileOutputStream fos = new FileOutputStream("E:\\copy.mp4");
        long start = System.currentTimeMillis();
        int b;
        while((b = fis.read())!=-1){
            fos.write(b);
        }
        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
