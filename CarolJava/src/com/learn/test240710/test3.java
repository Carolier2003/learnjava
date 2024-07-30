package com.learn.test240710;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/10 20:10
 */
public class test3 {
    public static void main(String[] args) {
        File f1 = new File("E:\\resource\\video");
        /*File[] arr = f1.listFiles();
        for (File file : arr) {
            if(file.exists()&&file.getName().endsWith(".mp4")){
                System.out.println(file.getName());
            }
        }
        System.out.println("--------------------------------");

        String[] arr2 = f1.list((dir, name) -> {
            File src = new File(dir, name);
            return src.exists() && name.endsWith(".mp4");
        });

        System.out.println(Arrays.toString(arr2));
        System.out.println("-------------------------------");

        File[] arr3 = f1.listFiles(pathname -> pathname.getName().endsWith(".mp4"));
        System.out.println(Arrays.toString(arr3));
        System.out.println("-------------------------------");

        File[] arr4 = f1.listFiles((pathname, name) -> name.endsWith(".mp4"));
        System.out.println(Arrays.toString(arr4));*/

        System.out.println(haveMp4(f1));
        findAllMp4();
    }

    public static boolean haveMp4(File file) {
        File[] files = file.listFiles();
        assert files != null;
        for (File file1 : files) {
            if(file1.isFile()&&file1.getName().endsWith(".mp4")){
                return true;
            }
        }
        return false;
    }

    public static void findAllMp4(){
        File[] f = File.listRoots();
        for (File file : f) {
            findAllMp4(file);
        }
    }

    public static void findAllMp4(File file){
        if(file.isDirectory()){
            File[] files = file.listFiles();
            if(files!=null){
                for (File file1 : files) {
                    if(file1.isFile()&&file1.getName().endsWith(".mp4")){
                        System.out.println(file1.getAbsoluteFile());
                        System.out.println(file1.getName());
                    } else if (file1.isDirectory()) {
                        findAllMp4(file1);
                    }
                }
            }
        }
    }
}
