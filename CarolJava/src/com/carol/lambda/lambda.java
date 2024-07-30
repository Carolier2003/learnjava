package com.carol.lambda;

import java.util.Arrays;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/2/7 19:51
 */
public class lambda {
    public static void main(String[] args) {
        Integer[] arr = {0, 3, 1, 2, 4, 5, 6, 9, 8, 7};
        Arrays.sort(arr, (o1, o2) -> o1 - o2);
        System.out.println(Arrays.toString(arr));
        method(new Swim() {
            @Override
            public void swimming() {
                System.out.println("正在游泳1");
            }
        });
        method(() -> System.out.println("正在游泳2"));
    }

    public static void method(Swim s) {
        s.swimming();
    }
}
@FunctionalInterface
interface Swim {
    public abstract void swimming();
}
