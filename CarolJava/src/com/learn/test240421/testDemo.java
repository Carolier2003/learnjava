package com.learn.test240421;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/4/21 22:07
 */
public class testDemo {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("Hello");
        myArrayList.add("World");
        String str = myArrayList.get(0);
        System.out.println(str);
        System.out.println(myArrayList);
    }
}
