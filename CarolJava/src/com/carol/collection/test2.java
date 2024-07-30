package com.carol.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/2/10 20:16
 */
public class test2 {
    public static void main(String[] args) {
        Collection<String> coll= new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        /* while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }*/
        for (String str : coll) {
            System.out.println(str);
        }

        coll.forEach(s-> System.out.println(s));
    }
}
