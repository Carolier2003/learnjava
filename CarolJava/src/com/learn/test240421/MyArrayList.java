package com.learn.test240421;

import java.util.Arrays;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/4/21 21:07
 */
public class MyArrayList<T> {
    private final Object[] obj = new Object[10];
    int size;


    public boolean add(T t) {
        obj[size++] = t;
        return true;
    }

    public T get(int index) {
        return (T) obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
