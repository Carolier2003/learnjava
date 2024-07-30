package com.learn.test240713;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/13 20:18
 */
public class test5 {
    public static void main(String[] args) throws IOException {
        File src = new File("CarolJava\\b.txt");
        FileReader fr = new FileReader(src);
        StringBuilder sb = new StringBuilder();
        //1，读取数据
        int ch;
        while ((ch = fr.read()) != -1) {
            sb.append((char) ch);
        }
        //2，转换数据
        Integer[] array = Arrays.stream(sb.toString().split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));
        //3，写入数据
        FileWriter fw = new FileWriter(src);
        String s = Arrays.toString(array).replace(", ", "-");
        String ans = s.substring(1,s.length()-1);
        fw.write(ans);
        fw.close();
        fr.close();
    }
}
