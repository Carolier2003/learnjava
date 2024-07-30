package com.learn.test240615;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/6/15 15:29
 */
public class test1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("aaa");
        try{
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("下标越界");
        }

        System.out.println("bbb");
    }
}
