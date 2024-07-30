package com.learn.test240714;

import java.io.*;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/14 21:10
 */
public class test96 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s1 = new Student("zhangSan",23);
        Student s2 = new Student();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("CarolJava\\d.txt"));

        oos.writeObject(s1);

        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("CarolJava\\d.txt"));
        s2 = (Student) ois.readObject();
        ois.close();
        System.out.println(s2);

    }
}
