package com.learn.test240615;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/6/15 16:32
 */
public class test4 {
    public static void main(String[] args) {
        int []arr = {};

        int max=0;
        try {
            max = getMax(arr);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(max);
    }

    public static int getMax(int[] arr) {
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException();
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
