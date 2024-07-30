package com.learn.test240714;

import java.io.*;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/14 15:16
 */
public class test8 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\aaa\\src\\[ANi] 【我推的孩子】 - 13 [1080P][Baha][WEB-DL][AAC AVC][CHT].mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\copy.mp4"));
        long start = System.currentTimeMillis();
        byte[] buf = new byte[1024 * 1024 * 5];
        int len;
        while ((len = bis.read(buf)) != -1) {
            bos.write(buf, 0, len);
        }
        bos.close();
        bis.close();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
