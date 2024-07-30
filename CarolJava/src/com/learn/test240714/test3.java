package com.learn.test240714;

import java.io.*;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/14 13:55
 */
public class test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("CarolJava\\a.txt"));
        String s;
        while((s = br.readLine())!=null){
            System.out.println(s);
        }
        br.close();
    }
}
