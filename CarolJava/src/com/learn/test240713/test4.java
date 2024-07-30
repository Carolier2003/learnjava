package com.learn.test240713;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/13 20:18
 */
public class test4 {
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
        String numStr = sb.toString();
        String[] arr = numStr.split("-");
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : arr) {
            list.add(Integer.parseInt(s));
        }
        Collections.sort(list);
        System.out.println(list);
        //3，写入数据
        FileWriter fw = new FileWriter(src);

        for (int i = 0; i < list.size(); i++) {
            if(i == list.size()-1){
                fw.write(list.get(i)+"");
            }else{
                fw.write(list.get(i)+"-");
            }
        }
        fw.close();
        fr.close();
    }
}
