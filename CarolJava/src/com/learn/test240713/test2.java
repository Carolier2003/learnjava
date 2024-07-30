package com.learn.test240713;

import java.io.FileWriter;
import java.io.IOException;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/13 16:24
 */
public class test2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("CarolJava\\b.txt");
        //fw.write("男人，什么罐子我能说");
        fw.write(11451);
        //char[] arr = {'a','b','c','我'};
        //fw.write(arr);
        fw.close();
    }
}
