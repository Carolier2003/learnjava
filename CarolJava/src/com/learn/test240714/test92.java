package com.learn.test240714;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.InputMismatchException;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/14 19:54
 */
public class test92 {
    public static void main(String[] args) throws IOException {
        /*InputStreamReader isr = new InputStreamReader(new FileInputStream("CarolJava\\gbkfile.txt"),"GBK");
        int ch;
        while((ch = isr.read())!=-1){
            System.out.print((char)ch);
        }
        isr.close();*/

        FileReader fr = new FileReader("CarolJava\\\\gbkfile.txt", Charset.forName("GBK"));
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();
    }
}
