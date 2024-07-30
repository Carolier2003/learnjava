package com.learn.test240715;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/15 16:05
 */
public class test4 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("CarolJava\\a.txt"),true);
        pw.println("Hello World");
        pw.print(true);
        pw.printf("%s爱上11了%s","阿珍","阿强");
        pw.close();
    }
}
