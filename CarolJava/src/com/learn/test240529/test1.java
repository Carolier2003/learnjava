package com.learn.test240529;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/5/29 19:30
 */
public class test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> arr = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(arr);
    }
}
