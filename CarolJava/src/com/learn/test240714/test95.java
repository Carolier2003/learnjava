package com.learn.test240714;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/14 20:35
 */
public class test95 {
    public static void main(String[] args) throws IOException {
       /* FileInputStream fis = new FileInputStream("CarolJava\\c.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        System.out.println(s);*/

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("CarolJava\\c.txt")));
        String s;
        while((s = br.readLine())!=null){
            System.out.println(s);
        }
        br.close();
    }
}
