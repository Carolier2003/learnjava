package com.carol.lambda;

import java.util.Arrays;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/2/7 20:35
 */
public class lambdaDemo1 {
    public static void main(String[] args) {
        String[] arr = {"a","apple","abstract","and"};
        Arrays.sort(arr, (o1,  o2) ->
                o1.length() - o2.length()
        );
        System.out.println(Arrays.toString(arr));
    }
}
