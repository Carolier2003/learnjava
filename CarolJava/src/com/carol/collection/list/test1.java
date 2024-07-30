package com.carol.collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/2/16 14:32
 */
public class test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        list.add(1,"QQQ");
        list.remove(1);
        list.set(1,"qqq");
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list = " + list);

    }
}
