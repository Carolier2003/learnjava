package test1;

import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/4/6 11:07
 */
//求全部子集
public class Main {
    static int n;
    static int maxN = 21;
    //0表示没有定义，1表示选，2表示不选
    static int[] st = new int[maxN];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        dfs(1);
    }

    /**
     * @param x 表示到了第几个数字
     */
    private static void dfs(int x) {
        if (x > n) {
            for (int i = 1; i <= n; i++) {
                if (st[i] == 1) {
                    System.out.print(" " + i);
                }
            }
            System.out.println();
            return;
        }
        //先选
        st[x] = 1;
        dfs(x + 1);
        //恢复状态
        st[x] = 0;

        //不选
        st[x] = 2;
        dfs(x + 1);
        st[x] = 0;
    }
}
