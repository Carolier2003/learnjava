package com.learn.test240714;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/14 13:59
 */
public class test4 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("CarolJava\\c.txt"));
        bw.write("男人，什么罐子我能说");
        bw.newLine();
        bw.write("曼巴出去");
        bw.close();
    }
}
