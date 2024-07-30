package com.learn.test240711;

import java.io.File;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/11 14:29
 */
public class test2 {
    public static void main(String[] args) {
        File file = new File("E:\\resource\\video");
        System.out.println(getLen(file));
    }

    public static long getLen(File file){
        long len = 0;
        File[] files = file.listFiles();
        if(files!=null){
            for(File f : files){
                if(f.isFile()){
                    len += f.length();
                }else{
                    len += getLen(f);
                }
            }
        }
        return len;
    }
}
