package com.learn.test240523;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/5/23 21:07
 */
public class test2 {
    public static void main(String[] args) {
        HashMap<String,Integer> map =new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        map.put("e",5);

        /*Set<String> stringSet = map.keySet();
        stringSet.stream().forEach(System.out::println);*/

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        entries.stream().forEach(System.out::println);
    }
}
