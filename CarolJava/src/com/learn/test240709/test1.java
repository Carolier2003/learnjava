package com.learn.test240709;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/9 15:42
 */
public class test1 {
    public static void main(String[] args) {
        File f1 = new File("D:\\Users\\19667\\Desktop\\助学贷款注意事项.docx");
        long time = f1.lastModified();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(time);
        System.out.println(sdf.format(time));
    }
}
