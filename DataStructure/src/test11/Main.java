package test11;

import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/4/7 12:43
 * 由于近期的降雨，雨水汇集在农民约翰的田地不同的地方。我们用一个 N x M(1 < N < 100,1<M < 100)的网格图表示。每个网格中有水(w)或是早地(.)。一个网格与其周围的八个网格相连，而一组相连的网格视为一个水坑。约翰想弄清楚他的田地已经形成了多少水坑。给出约翰田地的示意图，确定当中有多少水坑。
 * 输入第 1行:两个空格隔开的整数:N 和 M。
 * 它们表示网格图中的一排。字符之间没第 2 行到第 Ⅳ + 1 行:每行 M 个字符，每个字符是 w或，"有空格。
 * 输出一行，表示水坑的数量。
 */
public class Main {
    static int maxN = 110;
    static boolean[][] st = new boolean[maxN][maxN];
    static int N, M;
    static char[][] q = new char[maxN][maxN];
    static int ans = 0;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        String[] temp = new String[N];
        for (int i = 0; i < N; i++) {
            temp[i] = sc.next();
        }
        for (int i = 0; i < N; i++) {
            q[i] = temp[i].toCharArray();
        }
        /*for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(q[i][j]);
            }
            System.out.println();
        }*/
        sc.close();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!st[i][j]&&q[i][j]=='W') {
                    dfs(i, j);
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }

    public static void dfs(int x, int y) {
        for (int i = 0; i < 8; i++) {
            int a = x + dx[i], b = y + dy[i];
            if (a < 0 || a >= N || b < 0 || b >= M) {
                continue;
            }
            if(q[a][b]!='W'){
                continue;
            }
            if(st[a][b]){
                continue;
            }
            //灌水
            st[a][b]=true;
            dfs(a,b);
        }
    }
}
