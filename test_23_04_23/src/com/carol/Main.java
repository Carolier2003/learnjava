package com.carol;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[] prefixSum = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (i == 0) prefixSum[i] = arr[i];
            else prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            l--; r--;
            int ans;
            if (l == 0) ans = prefixSum[r];
            else ans = prefixSum[r] - prefixSum[l-1];
            System.out.println(ans);
        }
        sc.close();
    }
}