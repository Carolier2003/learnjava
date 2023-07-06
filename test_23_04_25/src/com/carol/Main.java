package com.carol;

import java.util.Scanner;

/**
 * {@code @Author} ${USER}
 * {@code @create} ${DATE} ${TIME}
 */
public class Main {
    public static void hanNoTa(int n, char original, char swap, char target) {
        if (n == 1) {
            System.out.println(original + "->" + target);
            return;
        }
        hanNoTa(n-1,original,target,swap);
        System.out.println(original + "->" + target);
        hanNoTa(n-1,swap,original,target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        hanNoTa(n,'A','B','C');
    }
}
