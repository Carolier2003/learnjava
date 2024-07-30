package com.learn.test240519;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/5/19 21:52
 */
public class test3 {
    public static void main(String[] args){
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        Collections.addAll(list1,"ccf","jjl","cz","ljh","nzn","z75","td","dl","glk","hlk");
        int size = list1.size();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println("------第"+(i+1)+"次点名开始了------");
            for (int j = 0; j < size; j++) {
                String name = list1.remove(r.nextInt(list1.size()));
                list2.add(name);
                System.out.println(name);
            }
            list1.addAll(list2);
            list2.clear();
        }
    }
}
