package com.learn.test240527;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/5/27 20:14
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "A", "B", "C", "D", "E", "F", "G", "H");
        list.stream().forEach(s->System.out.println(s));
        String[] arr = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(arr));
    }
}
