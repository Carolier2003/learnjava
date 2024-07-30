package test16;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/4/9 14:46
 * 题目描述m#复制Markdown:展开有一个n x m 的棋盘，在某个点(…,y)上有一个马，要求你计算出马到达棋盘上任意一个点最少要走几步。
 * 输入格式
 * 输入只有一行四个整数，分别为 n,m,,y。
 * 输出格式
 * 个nxm 的矩阵，代表马到达某个点最少要走几步(不能到达则输出 -1)。
 */
public class Main {
    static int N = 410;
    static int[][] g = new int[N][N];
    static int n, m, x, y;
    static Queue<Node> q = new LinkedList<>();
    static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                g[i][j] = -1;
            }
        }
        bfs(x, y);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.printf("%-4d",g[i][j]);
            }
            System.out.println();
        }
    }

    public static void bfs(int x, int y) {
        g[x][y] = 0;
        q.add(new Node(x, y));
        while (!q.isEmpty()) {
            Node cur = q.poll();
            for (int i = 0; i < 8; i++) {
                int a = cur.x + dx[i];
                int b = cur.y + dy[i];
                if (a < 1 || a > n || b < 1 || b > m) {
                    continue;
                }
                if (g[a][b] >= 0) {
                    continue;
                }
                q.add(new Node(a, b));
                g[a][b] = g[cur.x][cur.y] + 1;
            }
        }
    }
}

class Node {
    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int x, y;
}

