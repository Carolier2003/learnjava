package com.learn.test240516;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/5/16 19:10
 */
public class test1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 13);
        Collections.addAll(list2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
       /* System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, ((o1, o2) -> o2 - o1));
        System.out.println(list);*/
        System.out.println(list);
        System.out.println(Collections.binarySearch(list, 5));
        Collections.copy(list, list2);
        System.out.println(list);
        System.out.println(list2);
        Collections.fill(list,114514);
        System.out.println(list);
    }
}
