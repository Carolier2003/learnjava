package com.carol.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/2/16 15:35
 */
public class test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //1.迭代器
       /* Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }*/

        //2.列表迭代器
        /*ListIterator<String> lit = list.listIterator();
        while(lit.hasNext()){
            String str = lit.next();
            System.out.println(str);
        }*/

        //3.增强for
        /*for (String s : list) {
            System.out.println(s);
        }*/

        //4.Lambda表达式
        /*list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        //5.一般for循环
       /* for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/
    }
}
