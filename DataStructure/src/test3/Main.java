package test3;

import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/4/6 11:49
 */
//生成组合数
public class Main {
    //n的最大值
    static int maxN = 21;
    //表示一共有几个数
    static int n;
    //表示选几个数
    static int r;
    //存放数据的数组
    static int[] arr = new int[maxN];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r = sc.nextInt();
        sc.close();
        dfs(1, 1);
    }

    /**
     * @param x     表示取第几个数
     * @param start 表示从第几个数开始取
     */
    public static void dfs(int x, int start) {
        if (x > r) {
            for (int i = 1; i <= r; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = start; i <= n; i++) {
            arr[x] = i;
            dfs(x + 1, i + 1);
            arr[x] = 0;
        }
    }
}
