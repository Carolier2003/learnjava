package com.learn.test240604;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/6/4 21:11
 */
public class test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三,23", "李四,24", "王五,25", "赵六,26", "李家华,27", "聂哲宁,28");
        /*List<Student> list1 = list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                String[] split = s.split(",");
                String name = split[0];
                int age = Integer.parseInt(split[1]);
                return new Student(name, age);
            }
        }).collect(Collectors.toList());*/
        //System.out.println(list1);


        List<Student> list1 = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(list1);
    }
}
