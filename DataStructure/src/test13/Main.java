package test13;

import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/4/8 19:19
 * 将整数n 分成k份，且每份不能为空，任意两个方案不相同(不考虑顺序)例如:n = 7，k = 3，下面三种分法被认为是相同的。
 * 1,1,5:1 5,15,1,1.
 * 问有多少种不同的分法。
 */
public class Main {
    static int n, k;
    static int ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        sc.close();
        dfs(1, 0, 0);
        System.out.println(ans);
    }

    /**
     * @param start 表示从哪个数字开始枚举
     * @param x     表示枚举了几个数
     * @param sum   表示 x个数字的和
     */
    public static void dfs(int start, int x, int sum) {
        if (sum == n && k == x) {
            ans++;
            return;
        }
        if (sum > n || x > k) {
            return;
        }
        for (int i = start; i <= n - sum; i++) {
            dfs(i, x + 1, sum + i);
        }
    }
}
