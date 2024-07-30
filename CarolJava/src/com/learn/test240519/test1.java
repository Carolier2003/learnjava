package com.learn.test240519;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/5/19 16:29
 */
public class test1 {
    public static void main(String[] args){
        List<String> list  = new ArrayList<>();
        Collections.addAll(list,"ccf","jjl","cz","ljh","nzn","z75","td","dl","glk","hlk");
       /* Random r = new Random();
        int index = r.nextInt(list.size());
        System.out.println(list.get(index));*/
        Collections.shuffle(list);
        System.out.println(list.getFirst());

    }
}
