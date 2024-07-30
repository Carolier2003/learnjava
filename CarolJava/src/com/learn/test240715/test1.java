package com.learn.test240715;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/15 15:18
 */
public class test1 {
    public static void main(String[] args) throws IOException {
        Student s1 = new Student("zhangSan",23,"湖南");
        Student s2 = new Student("liSI",24,"广东");
        Student s3 = new Student("wangWu",245,"深圳");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("CarolJava\\a.txt"));
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        oos.writeObject(students);
        oos.close();
    }
}
