package test4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/4/6 13:06
 * 题目描述
 * 猪猪 Hanke 特别喜欢吃烤鸡(本是同畜牲，相煎何太急!)Hanke 吃鸡很特别，为什么特别呢?因为他有10 种配料(芥末、孜然等)，每种配料可以放1到3克，任意烤鸡的美味程度为所有配料质量之和。现在， Hanke 想要知道，如果给你一个美味程度n，请输出这 10 种配料的所有搭配方案。
 * 输入格式
 * 个正整数 n，表示美味程度。
 * 输出格式
 * 第一行，方案总数。
 * 第二行至结束，10 个数，表示每种配料所放的质量，按字典序排列。
 * 如果没有符合要求的方法，就只要在第一行输出一个 0。
 */
public class Main {
    static int maxN = 11;
    //状态数组 0 表示还没取 1 表示取1g 2 表示取2g 3表示取3g
    static int[] st = new int[maxN];
    //美味程度
    static int n;
    //表示一共有几种方法
    static int cnt = 0;
    //用于存放答案的数组
    static int[][] ans = new int[59050][11];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n < 10 || n > 30) {
            System.out.println(0);
        } else {
            dfs(1);
            sc.close();
            System.out.println(cnt);
            for (int i = 0; i < cnt; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.print(ans[i][j] + " ");
                }
                if (i != cnt - 1) {
                    System.out.println();
                }
            }
        }
    }

    /**
     * @param x 表示取到第几个调料了
     */
    public static void dfs(int x) {
        if (x > 10) {
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                sum += st[i];
            }
            if (sum == n) {
                ans[cnt] = Arrays.copyOf(st, 11);
                cnt++;
            }
            return;
        }
        //取1g
        st[x] = 1;
        dfs(x + 1);
        st[x] = 0;

        //取2g
        st[x] = 2;
        dfs(x + 1);
        st[x] = 0;

        //取3g
        st[x] = 3;
        dfs(x + 1);
        st[x] = 0;
    }

}
