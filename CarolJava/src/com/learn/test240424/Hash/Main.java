package com.learn.test240424.Hash;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/4/24 20:00
 */
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("张三",23);
        Student s2 = new Student("张三",23);


        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
