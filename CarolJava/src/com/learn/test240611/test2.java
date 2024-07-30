package com.learn.test240611;

import java.util.ArrayList;
import java.util.Collections;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/6/11 11:02
 */
public class test2 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangSan",23);
        Student s2 = new Student("liSi",24);
        Student s3 = new Student("wangWu",25);
        Student s4 = new Student("zhaoLiu",26);
        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list, s1, s2, s3, s4);

        String[] array = list.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(array);
    }
}
