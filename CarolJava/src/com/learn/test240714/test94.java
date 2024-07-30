package com.learn.test240714;

import java.io.*;
import java.nio.charset.Charset;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/14 20:11
 */
public class test94 {
    public static void main(String[] args) throws IOException {
        /*InputStreamReader isr = new InputStreamReader(new FileInputStream("CarolJava\\gbkfile.txt"),"GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("CarolJava\\utf-8.txt"));

        int ch ;
        while((ch = isr.read())!=-1){
            osw.write(ch);
        }
        osw.close();
        isr.close();*/

        FileReader fr = new FileReader("CarolJava\\gbkfile.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("CarolJava\\utf-8.txt");

        int b;
        while((b = fr.read()) != -1) {
            fw.write(b);
        }
        fw.close();
        fr.close();
    }
}
