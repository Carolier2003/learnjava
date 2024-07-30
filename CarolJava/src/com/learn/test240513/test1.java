package com.learn.test240513;

import java.util.*;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/5/13 20:18
 */
public class test1 {
    public static void main(String[] args) {
        String[] arr = {"A","B","C","D","E","F"};
        Random r = new Random();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 120; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }

        HashMap<String, Integer> map = new HashMap<>();
        for (String name : list) {
            if(map.containsKey(name)){
                int count = map.get(name);
                count++;
                map.put(name, count);
            }else{
                map.put(name,1);
            }
        }
        System.out.println(map);
        int max = 0;

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int count  = entry.getValue();
            if(count > max){
                max = count;
            }
        }

        for (Map.Entry<String, Integer> entry : entries) {
            int count  = entry.getValue();
            if(count == max){
                System.out.println(entry.getKey()+":"+max);
            }
        }
    }
}
