package com.learn.test240604;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/6/4 15:45
 */
public class test1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"1","2","3","4","5","6","7","8","9");
        ArrayList<Integer> list2 = new ArrayList<>();

        /*list1.stream().map(new Function<String, Integer>() {

            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }).forEach(s-> System.out.println(s));*/

        list1.stream().map(Integer::parseInt).forEach(list2::add);
        list2.forEach(System.out::println);
    }
}
