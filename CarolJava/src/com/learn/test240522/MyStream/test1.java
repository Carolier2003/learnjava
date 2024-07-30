package com.learn.test240522.MyStream;

import java.util.ArrayList;
import java.util.List;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/5/22 21:41
 */
public class test1 {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("114");
        list.add("111");
        list.add("11");
        list.add("514");
        list.add("515");
        list.add("516");

        list.stream().filter(name -> name.startsWith("1")).filter(name -> name.length()==3).forEach(System.out::println);
    }
}
