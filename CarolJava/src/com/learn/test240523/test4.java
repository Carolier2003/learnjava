package com.learn.test240523;

import java.util.ArrayList;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/5/23 22:04
 */
public class test4 {
    public static void main(String[] args) {
        // filter limit skip distinct concat map

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("114");
        arrayList.add("514");
        arrayList.add("1919");
        arrayList.add("810");
        arrayList.add("14");
        arrayList.add("123");
        arrayList.add("133");
        arrayList.add("133");
        arrayList.add("133");
        arrayList.add("133");
        arrayList.add("133");
        arrayList.add("133");

        //arrayList.stream().filter(s -> s.startsWith("1")).forEach(System.out::println);
        arrayList.stream().skip(2).limit(2).forEach(System.out::println);
        System.out.println("=============================");

        arrayList.stream().distinct().forEach(System.out::println);
    }
}
