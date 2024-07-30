package com.learn.test240715;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/15 15:21
 */
public class test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("CarolJava\\a.txt"));

        ArrayList<Student> list = (ArrayList<Student>)ois.readObject();
        for (Student student : list) {
            System.out.println(student);
        }

        ois.close();
    }
}
