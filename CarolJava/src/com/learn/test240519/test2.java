package com.learn.test240519;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/5/19 16:41
 */
public class test2 {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        List<String> man = new ArrayList<String>();
        List<String> woman = new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1,0,0,0);
        Collections.addAll(man,"ccf","jjl","cz","ljh","nzn","z75","td","glk");
        Collections.addAll(woman,"dl","hlk","lxl","gf");

        Collections.shuffle(list);
        Collections.shuffle(man);
        Collections.shuffle(woman);
        int choose = list.getFirst();
        if(choose == 1){
            System.out.println(man.getFirst());
        }else{
            System.out.println(woman.getFirst());
        }
    }
}
