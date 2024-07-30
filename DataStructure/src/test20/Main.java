package test20;


import java.util.*;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/4/9 22:22
 * 题目描述
 * 贝茜听说一场特别的流星雨即将到来:这些流星会撞向地球，并摧毁它们所撞击的任何东西。她为自己的安全感到焦虑，发誓要找到一个安全的地方(一个永远不会被流星摧毁的地方)。
 * 如果将牧场放入一个直角坐标系中，贝茜现在的位置是原点，并且，贝茜不能踏上一块被流星砸过的士
 * 地。
 * 根据预报，一共有 M 颗流星(1< M < 50,000)会坠落在农场上，其中第i颗流星会在时刻 T;(0<T,< 1000)砸在坐标为(X,,Y;)(0 < X;< 300,0< ,< 300)的格子里。流星的力量会将它所在的格子，以及周围 4个相邻的格子都化为焦土，当然贝茜也无法再在这些格子上行走。
 * 贝茜在时刻 0开始行动，她只能在第一象限中，平行于坐标轴行动，每1个时刻中，她能移动到相邻的(一般是4个)格子中的任意一个，当然目标格子要没有被烧售才行。如果一个格子在时刻t被流星撞未或烧焦，那么贝茜只能在t之前的时刻在这个格子里出现。 贝茜一开始在(0.0)。
 * 请你计算一下，贝茜最少需要多少时间才能到达一个安全的格子。如果不可能到达输出 -1。
 * 输入格式
 * 共 M +1行，第1行输入一个整数 M，接下来的 M 行每行输入三个整数分别为 X;,Y,T。
 * 输出格式
 * 贝茜到达安全地点所需的最短时间，如果不可能，则为一1。
 */
public class Main {
    static int MAX = 301;
    static int[][] fire = new int[MAX][MAX];
    static int[][] walk = new int[MAX][MAX];
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < MAX; i++) {
            Arrays.fill(fire[i], Integer.MAX_VALUE);
            Arrays.fill(walk[i], -1);
        }

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int t = sc.nextInt();
            fire[x][y] = Math.min(fire[x][y], t);
            for (int j = 0; j < 4; j++) {
                int a = x + dx[j];
                int b = y + dy[j];
                if (a >= 0 && a < MAX && b >= 0 && b < MAX) {
                    fire[a][b] = Math.min(fire[a][b], t);
                }
            }
        }
        sc.close();

        int ans = bfs();
        System.out.println(ans);
    }

    public static int bfs() {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        walk[0][0] = 0;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (nx >= 0 && nx < MAX && ny >= 0 && ny < MAX) {
                    if (walk[nx][ny] == -1 && walk[curX][curY] + 1 < fire[nx][ny]) {
                        walk[nx][ny] = walk[curX][curY] + 1;
                        queue.offer(new int[]{nx, ny});
                        if (fire[nx][ny] == Integer.MAX_VALUE) {
                            return walk[nx][ny];
                        }
                    }
                }
            }
        }
        return -1;
    }
}
