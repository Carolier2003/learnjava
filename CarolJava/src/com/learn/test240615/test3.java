package com.learn.test240615;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/6/15 16:09
 */
public class test3 {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //System.out.println(e.getMessage());
            //System.out.println(e.toString());
            //e.printStackTrace();
            e.printStackTrace();
        }

        System.out.println("看看我运行了吗");
    }
}
