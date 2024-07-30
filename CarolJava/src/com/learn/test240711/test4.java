package com.learn.test240711;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/11 19:00
 */
public class test4 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("CarolJava\\a.txt");
        byte[] bytes = {97, 98, 99, 100, 101, 102, 103, 104, 105};
        //fos.write(97);
        //fos.write(bytes);
        fos.write(bytes,2,3);
        fos.close();
    }
}
