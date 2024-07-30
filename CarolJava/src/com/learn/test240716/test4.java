package com.learn.test240716;

import cn.hutool.core.io.file.FileReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/16 22:06
 */
public class test4 {
    public static void main(String[] args) {
        FileReader src = new FileReader("C:\\Users\\19667\\IdeaProjects\\CarolJava\\out\\production\\CarolJava\\CarolJava\\names.txt");
        List<String> names = src.readLines();
        List<String> boys = new ArrayList<>();
        List<String> girls = new ArrayList<>();
        for (String name : names) {
            if ("男".equals(name.split("-")[1])) {
                boys.add(name);
            } else {
                girls.add(name);
            }
        }
        Integer[] oddsInt = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1};
        List<Integer> odds = new ArrayList<>();
        Collections.addAll(odds,oddsInt);

        int man = 0;
        int woMan = 0;
        for (int i = 0; i < 1000000; i++) {
            Collections.shuffle(odds);
            if(odds.getFirst()==0){
                Collections.shuffle(boys);
                man++;
                System.out.printf("第%d次运行程序：随机同学姓名 %s%n", i + 1, boys.getFirst().split("-")[0]);
            }else{
                Collections.shuffle(girls);
                woMan++;
                System.out.printf("第%d次运行程序：随机同学姓名 %s%n", i + 1, girls.getFirst().split("-")[0]);
            }
        }
        System.out.println(man);
        System.out.println(woMan);
    }
}
