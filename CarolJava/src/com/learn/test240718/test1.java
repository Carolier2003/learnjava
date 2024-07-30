package com.learn.test240718;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/18 10:00
 */
public class test1 {
    public static void main(String[] args) throws IOException {
        Properties port = new Properties();
        port.put("aaa","111");
        port.put("bbb","222");
        port.put("ccc","333");
        port.put("ddd","444");
        FileOutputStream fos = new FileOutputStream("CarolJava\\a.properties");
        port.store(fos,"test");
        fos.close();
    }
}
