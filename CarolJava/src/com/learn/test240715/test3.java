package com.learn.test240715;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/15 15:48
 */
public class test3 {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream(new FileOutputStream("CarolJava\\a.txt"),true,"UTF-8");
        ps.println("Hello World");
        ps.print(true);
        ps.printf("%s爱上了%s","阿珍","阿强");
        ps.close();
    }
}
