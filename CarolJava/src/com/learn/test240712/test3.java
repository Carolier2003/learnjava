package com.learn.test240712;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/12 19:39
 */
public class test3 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "我并不讨厌俞馨怡233";

        byte[] bytes1 = str.getBytes();
        System.out.println(Arrays.toString(bytes1));

        byte[] bytes2 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));

        String str1 = new String(bytes1, "GBK");
        System.out.println(str1);
        String str2 = new String(bytes1);
        System.out.println(str2);
    }
}
