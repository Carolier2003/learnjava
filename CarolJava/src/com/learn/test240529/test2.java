package com.learn.test240529;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/5/29 19:34
 */
public class test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("zhangSan,23");
        list.add("liSi,24");
        list.add("wangWu,25");

        Map<String, String> map = list.stream().filter(x -> Integer.
                        parseInt(x.split(",")[1]) >= 24).
                collect(Collectors.toMap(s -> s.split(",")[0], s -> s.split(",")[1]));
        System.out.println(map);
    }
}
