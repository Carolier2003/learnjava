package com.learn.test240514;


import java.util.Comparator;
import java.util.TreeMap;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/5/14 10:26
 */
public class test1 {
    public static void main(String[] args) {
       /* TreeMap<Integer, String> tm = new TreeMap<>((o1,o2)-> o2-o1);
        tm.put(123,"西地那非");
        tm.put(100,"阿司匹林");
        tm.put(114,"阿莫西林");
        tm.put(159,"头孢");
        tm.put(173,"泻药");
        System.out.println(tm);*/
        TreeMap<Student,String> tm = new TreeMap<>();
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s1 = new Student("zhangsan",23);

        tm.put(s1,"湖南");
        tm.put(s2,"湖北");
        tm.put(s3,"江西");

        System.out.println(tm);
    }
}
