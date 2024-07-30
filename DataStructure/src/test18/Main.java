package test18;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/4/9 18:15
 * 题目描述
 * 爱与愁大神坐在公交车上无聊，于是玩起了手机。一款奇怪的游戏进入了爱与愁大神的眼帘:***(游戏名被打上了马赛克)。这个游戏类似象棋，但是只有黑白马各一匹，在点 “1,y 和 “2,y 上。它们得从点1,y 和 ?,2 走到(1,1)。这个游戏与普通象棋不同的地方是:马可以走“日"，也可以像象走“田”。现在爱与愁大神想知道两匹马到(1,1)的最少步数，你能帮他解决这个问题么?
 * 注意不能走到 æ 或y坐标 < 0 的位置。
 * 输入格式
 * 第一行两个整数 1, y1。
 * 第二行两个整数 2, y2。
 * 输出格式
 * 第一行一个整数，表示黑马到(1,1)的步数。
 * 第二行一个整数，表示白马到(1,1)的步数。
 */

public class Main {
    static int N = 30;
    static int[][] distance = new int[N][N];
    static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2, -1, 2, 1, -2};
    static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1, 2, 2, -2, -2};
    static Queue<int[]> q = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1, y1, x2, y2;
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        bfs(1, 1);
        sc.close();
        System.out.println(distance[x1][y1]);
        System.out.println(distance[x2][y2]);
    }

    public static void bfs(int x, int y) {
        q.offer(new int[]{x, y});
        distance[x][y] = 0;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int i = 0; i < 12; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
                if (nx < 1 || nx >= N || ny < 1 || ny >= N) {
                    continue;
                }
                if(distance[nx][ny] > 0) {
                    continue;
                }
                distance[nx][ny] = distance[cur[0]][cur[1]] + 1;
                q.add(new int[]{nx, ny});
            }
        }
    }
}

