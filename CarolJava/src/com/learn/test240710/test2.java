package com.learn.test240710;

import java.io.File;
import java.io.IOException;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/10 19:57
 */
public class test2 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("CarolJava\\aaa");
        boolean mkdir = f1.mkdirs();
        System.out.println(mkdir);
        File f2 = new File(f1,"aaa.txt");
        boolean newFile = f2.createNewFile();
        System.out.println(newFile);
    }
}
