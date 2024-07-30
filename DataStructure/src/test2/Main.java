package test2;

import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/4/6 11:26
 */
//求排列数的代码
public class Main {
    static int maxN = 21;
    static int[] arr = new int[maxN];
    static boolean[] st = new boolean[maxN];
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        dfs(1);
    }

    public static void dfs(int x) {
        if(x>n){
            for (int i = 1; i <= n; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!st[i]) {
                st[i] = true;
                arr[x] = i;
                dfs(x + 1);
                st[i] = false;
                arr[x] = 0;
            }
        }
    }
}
