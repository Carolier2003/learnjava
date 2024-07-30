package com.learn.test240615;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/6/15 15:50
 */
public class test2 {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};

        try{
            System.out.println(arr[10]);
            System.out.println(2/0);
        }catch (ArrayIndexOutOfBoundsException|ArithmeticException e){
            System.out.println("错误了");
        }

        System.out.println("aaa");
    }
}
