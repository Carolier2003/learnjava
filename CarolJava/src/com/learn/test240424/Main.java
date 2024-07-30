package com.learn.test240424;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.function.Consumer;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/4/24 19:27
 */
public class Main {
    public static void main(String[] args) {

        Set<String> s = new HashSet<>();

        s.add("张三");
        s.add("李四");
        s.add("王五");

        /*Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }*/

        /*for (String string : s) {
            System.out.println(string);
        }*/

        s.forEach(System.out::println);
    }
}
