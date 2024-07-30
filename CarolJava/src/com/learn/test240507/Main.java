package com.learn.test240507;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/5/7 10:17
 */
public class Main {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();

        map.put("尹志平","小龙女");
        map.put("郭靖","穆念慈");
        map.put("欧阳克","黄蓉");


        Set<String> keys = map.keySet();
        /*for(String key:keys){
            System.out.println(key+" "+map.get(key));
        }*/

       /* Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            String key = it.next();
            System.out.println(key+":"+map.get(key));
        }*/

        /*keys.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s+":"+map.get(s));
            }
        });*/

//        keys.forEach(s -> System.out.println(s+":"+map.get(s)));


        //采用键值对的方式遍历
        Set<Map.Entry<String, String>> entries = map.entrySet();
        /*for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+":"+value);
        }*/

        //Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        /*while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+":"+value);
        }*/

        /*entries.forEach(new Consumer<Map.Entry<String, String>>() {
            @Override
            public void accept(Map.Entry<String, String> stringStringEntry) {
                String key = stringStringEntry.getKey();
                String value = stringStringEntry.getValue();
                System.out.println(key+":"+value);
            }
        });*/

       /* entries.forEach(stringStringEntry -> {
            String key = stringStringEntry.getKey();
            String value = stringStringEntry.getValue();
            System.out.println(key+":"+value);
        });*/

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+":"+value);
            }
        });
    }
}
