package test15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/4/9 11:13
 * 题目描述
 * 爱与愁大神买完东西后，打算坐车离开中山路。现在爱与愁大神在 1,y 处，车站在 2,y2 处。现在给出-个nxn(n< 1000)的地图，0 表示马路，，1表示店铺(不能从店铺穿过)，爱与愁大神只能垂直或水平着在马路上行进。爱与愁大神为了节省时间，他要求最短到达目的地距离(每两个相邻坐标间距离为 1)。你能帮他解决吗?
 * 输入格式
 * 第1行包含一个数 n。
 * 第2 行到第几 +1行:整张地图描述(0 表示马路，1 表示店铺，注意两个数之间没有空格)。
 * 第n+2 行:四个数 1, y1, 2, y2。
 * 输出格式
 * 只有1行，即最短到达目的地距离
 */
public class Main {
    static int N = 1100;
    //用于存储地图
    static char[][] g = new char[N][N];
    static int n;
    static int ans = 0;
    //用于存储到起点的距离
    static int[][] distance = new int[N][N];
    static Node start, end;
    static Queue<Node> q = new LinkedList<>();
    //定义方向数组
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            g[i] = sc.next().toCharArray();
        }
        start = new Node(sc.nextInt() - 1, sc.nextInt() - 1);
        end = new Node(sc.nextInt() - 1, sc.nextInt() - 1);
        sc.close();
        ans = bfs(start.x, start.y);
        System.out.println(ans);
    }

    public static int bfs(int x, int y) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                distance[i][j] = -1;
            }
        }
        distance[x][y] = 0;
        q.offer(new Node(x, y));
        while (!q.isEmpty()) {
            Node cur = q.poll();
            for (int i = 0; i < 4; i++) {
                int a = cur.x + dx[i];
                int b = cur.y + dy[i];

                if (a < 0 || a >= n || b < 0 || b >= n) {
                    continue;
                }
                if (g[a][b] != '0') {
                    continue;
                }
                if (distance[a][b] >= 0) {
                    continue;
                }
                q.offer(new Node(a, b));
                distance[a][b] = distance[cur.x][cur.y] + 1;
                if (a == end.x && b == end.y) {
                    break;
                }
            }
        }
        return distance[end.x][end.y];
    }
}

class Node {
    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int x, y;
}
