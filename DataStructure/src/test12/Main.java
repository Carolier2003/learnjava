package test12;

import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/4/7 19:29
 * 在一个给定形状的棋盘(形状可能是不规则的)上面摆放棋子，棋子没有区别。要求摆放时任意的两个棋子不能放在棋盘中的同一行或者同一列，请编程求解对于给定形状和大小的棋盘，摆放 k个棋子的所有可行地摆放方案数目 C。
 * 输入格式
 * 输入含有多组测试数据。
 * 每组数据的第一行是两个正整数 ”,k，用一个空格隔开，表示了将在一个几*”,的矩阵内描述棋盘，以及摆放棋子的数目。当为-1 -1 时表示输入结束。
 * 随后的 n 行描述了棋盘的形状:每行有 , 个字符，其中 #表示棋盘区域，表示空白区域(数据保证不出现多余的空白行或者空白列)。
 * 输出格式
 * 对于每一组数据，给出一行输出，输出摆放的方案数目 C(数据保证 C < 231)。
 * 数据范围
 * n<8,k<n
 */
public class Main {
    static int N = 10;
    static int ans = 0;
    static char[][] chessboard = new char[N][N];
    // 几*几的棋盘
    static int n;
    // 需要放的棋子
    static int k;
    // 表示每一列是否被放过
    static boolean[] st = new boolean[N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        while (n >= 0 && k >= 0) {
            chessboard = new char[N][N];
            for (int i = 0; i < n; i++) {
                chessboard[i] = sc.next().toCharArray();
            }
            /*
             * for (int i = 0; i < n; i++) { for (int j = 0; j < n; j++) {
             * System.out.print(chessboard[i][j]);
             *
             * } System.out.println(); }
             */
            dfs(0, 0);
            System.out.println(ans);
            ans = 0;
            n = sc.nextInt();
            k = sc.nextInt();
        }
        sc.close();
    }

    /**
     * @param x   表示枚举到了第几行
     * @param cnt 表示目前放了几个棋子了
     */
    private static void dfs(int x, int cnt) {
        if (cnt == k) {
            ans++;
            return;
        }
        if (x == n) {
            return;
        }
        // 遍历每一列
        for (int i = 0; i < n; i++) {
            if (!st[i] && chessboard[x][i] == '#') {
                st[i] = true;
                dfs(x + 1, cnt + 1);
                // 恢复现场
                st[i] = false;
            }
        }
        dfs(x + 1, cnt);
    }
}
