package com.learn.test240523;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/5/23 21:12
 */
public class test3 {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        Arrays.stream(arr).forEach(System.out::println);
    }
}
