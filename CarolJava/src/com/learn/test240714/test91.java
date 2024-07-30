package com.learn.test240714;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/14 16:06
 */
public class test91 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("CarolJava\\number.txt");
        int b = fis.read();
        FileOutputStream fos = new FileOutputStream("CarolJava\\number.txt");
        if (b >= '3') {
            System.out.println("本软件只能免费使用3次，欢迎您注册会员之后继续使用");
            fos.write(b);
        } else {
            b = b + 1;
            System.out.println("欢迎使用本软件，第" + (b - '0') + "次使用免费");
            System.out.println("看到了好康的");
            fos.write(b);
        }

    }
}
