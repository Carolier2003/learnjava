package com.learn.test240425;

import java.util.TreeSet;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/4/25 23:09
 */
public class test2 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>((o1, o2) -> {
            int i = o1.length() - o2.length();
            i = i ==0 ? o1.compareTo(o2) : i;
            return i;
        });

        treeSet.add("c");
        treeSet.add("df");
        treeSet.add("ac");
        treeSet.add("aber");

        System.out.println(treeSet);
    }
}
