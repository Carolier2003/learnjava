package com.learn.test240711;

import java.io.File;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/11 13:59
 */
public class test1 {
    public static void main(String[] args) {
        File f1 = new File("D:\\aaa");
        deleteAll(f1);
    }


    public static void deleteAll(File file){
        File[] files = file.listFiles();
        if(files!=null){
            for(File f:files){
                if(f.isDirectory()){
                    deleteAll(f);
                }else{
                    f.delete();
                }
            }
        }
        file.delete();
    }
}
