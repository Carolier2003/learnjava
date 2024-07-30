package com.learn.test240710;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/10 19:26
 */
public class test1 {
    public static void main(String[] args) {
        File[] arr = File.listRoots();
        System.out.println(Arrays.toString(arr));
        
        File f1 = new File("D:\\");
        String[] arr1 = f1.list();
        for (String name : arr1) {
            System.out.println(name);
        }
        System.out.println("----------------------------------");
        String[] arr2 = f1.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir, name);
                return src.isFile()&&name.endsWith(".zip");
            }
        });

        System.out.println(Arrays.toString(arr2));
        System.out.println("---------------------------------");

        File[] arr3 = f1.listFiles();
        for (File file : arr3) {
            if(file.isFile()&&file.getName().endsWith(".zip")) {
                System.out.println(file.getName());
            }
        }

    }
}
