package com.learn.test240714;

import java.io.*;
import java.util.*;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/14 15:30
 */
public class test9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("CarolJava\\csb.txt"));
        TreeMap<Integer, String> map = new TreeMap<>();
        String line;
        while((line = br.readLine())!=null){
            String[] arr = line.split("\\.");
            map.put(Integer.parseInt(arr[0]), arr[1]);
        }
        br.close();
        System.out.println(map);

        BufferedWriter bw = new BufferedWriter(new FileWriter("CarolJava\\c.txt"));
        /*for(Map.Entry<Integer, String> entry : map.entrySet()){
            bw.write(entry.getValue());
            bw.newLine();
        }
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            bw.write(entry.getValue());
            bw.newLine();
        }

        for(Integer key : map.keySet()){
            String value = map.get(key);
            bw.write(value);
            bw.newLine();
        }

        map.forEach((k,v)->{
            try {
                bw.write(v);
                bw.newLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        */
        for(Integer key : map.keySet()){
            String value = map.get(key);
            bw.write(value);
            bw.newLine();
        }
        bw.close();
    }
}
