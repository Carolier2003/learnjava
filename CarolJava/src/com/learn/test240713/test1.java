package com.learn.test240713;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/13 14:47
 */
public class test1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("CarolJava\\b.txt");
        /*int b;
        while((b = fr.read())!=-1){
            System.out.print((char)b);
        }*/
        char [] str = new char[2];
        int len;
        while((len = fr.read(str))!=-1){
            System.out.println(new String(str,0,len));
        }
        fr.close();

    }
}
