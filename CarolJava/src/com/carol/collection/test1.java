package com.carol.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/2/9 18:40
 */
public class test1 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println("coll = " + coll);
        //coll.clear();
        coll.remove("aaa");
        System.out.println("coll = " + coll);
        System.out.println("coll.contains(\"aaa\") = " + coll.contains("aaa"));
        System.out.println("coll.contains(\"bbb\") = " + coll.contains("bbb"));
        System.out.println("coll.size() = " + coll.size());
    }
}
