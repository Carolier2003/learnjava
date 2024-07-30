package com.learn.test240714;

import java.io.*;
import java.nio.charset.Charset;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/14 20:04
 */
public class test93 {
    public static void main(String[] args) throws IOException {
        /*OutputStreamWriter osr = new OutputStreamWriter(new FileOutputStream("CarolJava\\d.txt"), Charset.forName("GBK"));

        osr.write("你看你妈呢");

        osr.close();*/

        FileWriter fw = new FileWriter("CarolJava\\\\e.txt",Charset.forName("GBK"));
        fw.write("男人，什么罐子我能说");
        fw.close();

    }
}
