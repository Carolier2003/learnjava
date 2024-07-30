package com.learn.test240530;

import java.util.Arrays;
import java.util.Comparator;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/5/30 20:57
 */
public class test1 {
    public static void main(String[] args) {
        Integer[] arr = {5, 6, 9, 1, 2, 3, 4, 6, 45, 789, 123, 456, 258, 123};
        /*Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });*/

        /*Arrays.sort(arr,(Integer o1, Integer o2)->{
            return o2 - o1;
        });*/

        //Arrays.sort(arr, (o1, o2) -> o2 - o1);

        Arrays.sort(arr,test1::sub);

        System.out.println(Arrays.toString(arr));
    }

    public static int sub(int a, int b) {
        return b - a;
    }
}
