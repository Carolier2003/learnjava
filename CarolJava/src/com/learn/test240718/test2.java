package com.learn.test240718;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/18 10:10
 */
public class test2 {
    public static void main(String[] args) throws IOException {
        Properties port = new Properties();
        FileInputStream fis = new FileInputStream("CarolJava\\a.properties");
        port.load(fis);
        System.out.println(port);
    }
}
