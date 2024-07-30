package com.learn.test240624;

import java.io.File;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/6/24 23:14
 */
public class test1 {
    public static void main(String[] args) {
        String str = "C:\\Users\\19667\\Desktop\\a.txt";
        File f1 = new File(str);
        System.out.println(f1);

        String parent = "C:\\Users\\19667\\Desktop";
        String child = "a.txt";
        File f2 = new File(parent, child);
        System.out.println(f2);

        File f3 = new File(parent);

        File f4 = new File(f3,child);
        System.out.println(f4);
    }
}