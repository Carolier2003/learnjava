package com.learn.test240507;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/5/7 16:09
 */
public class test1 {
    public static void main(String[] args) {
        Student s1 = new Student("张三",23);
        Student s2 = new Student("李四",24);
        Student s3 = new Student("王五",25);

        HashMap<Student,String> hm = new HashMap<>();
        hm.put(s1,"湖南");
        hm.put(s2,"四川");
        hm.put(s3,"江西");


        Set<Student> keys = hm.keySet();
        for(Student s : keys){
            String value = hm.get(s);
            System.out.println(s+":"+value);
        }

        System.out.println("----------------");

        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for(Map.Entry<Student, String> entry : entries){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        System.out.println("----------------");

        hm.forEach(new BiConsumer<Student, String>() {
            @Override
            public void accept(Student student, String s) {
                System.out.println(student+":"+s);
            }
        });
    }
}
