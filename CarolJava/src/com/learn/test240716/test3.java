package com.learn.test240716;

import cn.hutool.core.io.file.FileReader;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/16 21:25
 */
public class test3 {
    public static void main(String[] args) {
        FileReader src = new FileReader("C:\\Users\\19667\\IdeaProjects\\CarolJava\\out\\production\\CarolJava\\CarolJava\\names.txt");
        List<String> names = src.readLines();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要点名的人数");
        int counts = sc.nextInt();
        for (int i = 0; i < counts; i++) {
            Collections.shuffle(names);
            System.out.printf("第%d次运行程序：随机同学姓名 %s%n", i + 1, names.getFirst().split("-")[0]);
        }
    }
}
