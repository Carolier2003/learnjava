package com.learn.test240523;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/5/23 21:01
 */
public class test1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);
        list.stream().forEach(s -> System.out.println(s));
    }
}
