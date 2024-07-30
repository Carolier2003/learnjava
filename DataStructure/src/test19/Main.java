package test19;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/4/9 21:01
 * 题目描述M:复制Markdown:]展开由数字 0组成的方阵中，有一任意形状的由数字1构成的闭合圈。现要求把闭合圈内的所有空间都填写成2。例如:6 x6的方阵(n = 6)，涂色前和涂色后的方阵如下:
 * 如果从某个0出发，只向上下左右 4个方向移动且仅经过其他 0 的情况下，无法到达方阵的边界，就认为这个0在闭合圈内。闭合圈不一定是环形的，可以是任意形状，但保证闭合圈内的0是连通的(两两之间可以相互到达)
 * 000000
 * 000111
 * 011001
 * 110001
 * 100101
 * 111111
 * 000000
 * 000111
 * 01122111222 1122121111111
 * 输入格式
 * 每组测试数据第一行一个整数 n(1 < n < 30)。
 * 接下来n 行，由0和1组成的n xn的方阵。
 * 方阵内只有一个闭合圈，圈内至少有一个 0。
 * 输出格式
 * 已经填好数字 2 的完整方阵。
 */
public class Main {
    static int N = 40;
    static int[][] g = new int[N][N];
    static boolean[][] st = new boolean[N][N];
    static int n;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Queue<int[]> q = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                g[i][j] = sc.nextInt();
            }
        }
        bfs(0, 0);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (!st[i][j] && g[i][j] == 0) {
                    System.out.print(2 + " ");
                } else {
                    System.out.print(g[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void bfs(int x, int y) {
        q.add(new int[]{x, y});
        st[x][y] = true;
        while (!q.isEmpty()) {
            int[] temp = q.poll();
            for (int i = 0; i < 4; i++) {
                int a = temp[0] + dx[i];
                int b = temp[1] + dy[i];
                if (a < 0 || a >= N || b < 0 || b >= N) {
                    continue;
                }
                if (st[a][b]) {
                    continue;
                }
                if (g[a][b] == 1) {
                    continue;
                }
                st[a][b] = true;
                q.add(new int[]{a, b});
            }
        }
    }
}
