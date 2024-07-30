package com.learn.test240611;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/6/11 10:14
 */
public class test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"zhangsan,23","lisi,24","wangwu,25","zhaoliu,26");

        Student[] students = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(students));
    }
}
