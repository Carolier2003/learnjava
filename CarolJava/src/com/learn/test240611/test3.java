package com.learn.test240611;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/6/11 11:06
 */
public class test3 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangSan",27);
        Student s2 = new Student("liSi",28);
        Student s3 = new Student("wangWu",29);
        Student s4 = new Student("zhaoLiu",20);
        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list, s1, s2, s3, s4);

        String[] array = list.stream().map(Student::toString).toArray(String[]::new);
        System.out.println(Arrays.toString(array));
    }
}
