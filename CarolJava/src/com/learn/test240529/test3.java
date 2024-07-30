package com.learn.test240529;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/5/29 20:14
 */
public class test3 {
    public static void main(String[] args) {
        ArrayList<Actor> actors = new ArrayList<>();
        ArrayList<String> listMan = new ArrayList<>();
        Collections.addAll(listMan,"张三，23","李四，24","王五，25","z75，26","李家华，19","聂哲宁，20");
        ArrayList<String> listWoman = new ArrayList<>();
        Collections.addAll(listWoman,"高方，23","杨阳养，24","杨李晓乐，23","杨鑫，26","斯伯土，19","陈春帆，20");
        Stream<String> sum = Stream.concat(listMan.stream().filter(s -> s.split("，")[0].length() == 3).limit(2),
                listWoman.stream().filter(s -> s.startsWith("杨")).skip(1));
        /*sum.forEach(s ->actors.add(new Actor(s.split("，")[0],Integer.parseInt(s.split("，")[1]))));
        for (Actor actor : actors) {
            System.out.println(actor);
        }*/
        /*sum.map(new Function<String,Actor>() {
            @Override
            public Actor apply(String s) {
                String name = s.split("，")[0];
                int age = Integer.parseInt(s.split("，")[1]);
                return new Actor(name, age);
            }
        }).forEach(actors::add);*/
        sum.map(s -> new Actor(s.split("，")[0],Integer.parseInt(s.split("，")[1]))).forEach(s-> actors.add(s));
        for (Actor actor : actors) {
            System.out.println(actor);
        }
    }
}
