package com.learn.test240610;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/6/10 21:56
 */
public class test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"aaa","bbb","ccc","ddd");

        /*list.stream().map(new Function<String, String>() {

            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        }).forEach(System.out::println);*/
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
