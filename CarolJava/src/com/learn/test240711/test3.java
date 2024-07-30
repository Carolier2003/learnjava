package com.learn.test240711;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/11 14:47
 */
public class test3 {
    public static void main(String[] args) {
        File file = new File("E:\\resource\\video");
        HashMap<String,Integer> type = new HashMap<>();
        categorizeFiles(file, type);
        /*for(Map.Entry<String,Integer> entry:type.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }*/
        //type.forEach((k,v)->{System.out.println(k+":"+v);});
        type.entrySet().forEach(System.out::println);
    }

    public static void categorizeFiles(File file, HashMap<String, Integer> hashMap) {
        File[] files = file.listFiles();
        if(files != null){
            for (File f : files) {
                if(f.isFile()){
                    int len = f.getName().split("\\.").length;
                    String type = f.getName().split("\\.")[len-1];
                    //System.out.println(type);
                    if(hashMap.containsKey(type)){
                        hashMap.put(type, hashMap.get(type)+1);
                    }else{
                        hashMap.put(type, 1);
                    }
                }else{
                    categorizeFiles(f, hashMap);
                }
            }
        }
    }
}
