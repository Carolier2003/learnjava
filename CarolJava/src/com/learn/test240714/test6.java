package com.learn.test240714;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/14 15:09
 */
public class test6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\aaa\\src\\[ANi] 【我推的孩子】 - 13 [1080P][Baha][WEB-DL][AAC AVC][CHT].mp4");
        FileOutputStream fos = new FileOutputStream("E:\\copy.mp4");
        long start = System.currentTimeMillis();
        byte[] buf = new byte[1024 * 1024 * 5];
        int len;
        while((len = fis.read(buf))!=-1){
            fos.write(buf, 0, len);
        }
        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
