package com.learn.test240425;

import java.util.TreeSet;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/4/25 20:13
 */
public class test1 {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<Student>();

        Student a1 = new Student(23,"zhangsan");
        Student a2 = new Student(24,"lisi");
        Student a3 = new Student(25,"wangwu");
        Student a4 = new Student(26,"zhaoliu");

        set.add(a2);
        set.add(a4);
        set.add(a3);
        set.add(a1);

        System.out.println(set);
    }
}
