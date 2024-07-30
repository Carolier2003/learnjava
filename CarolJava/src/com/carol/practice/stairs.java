package com.carol.practice;

import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/2/8 14:22
 */
public class stairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入阶梯数量");
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        System.out.println(dp[n]);
    }
}
