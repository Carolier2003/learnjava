package test17;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/4/9 15:49
 * 题目背景
 * m:复制Markdown:展开
 * 巫妖王的天灾军团终于卷土重来，血色十字军组织了一支先锋军前往诺森德大陆对抗天灾军团，以及一切沾有亡灵气息的生物。孤立于联盟和部落的血色先锋军很快就遭到了天灾军团的重重包围，现在他们将主力只好聚集了起来，以抵抗天灾军团的围剿。可怕的是，他们之中有人感染上了亡灵瘟疫，如果不设法阻止瘟疫的扩散，很快就会遭到灭顶之灾。大领主阿比迪斯已经开始调查瘟疫的源头。原来是血色先锋军的内部出现了叛徒，这个叛徒已经投靠了天灾军团，想要将整个血色先锋军全部转化为天灾军团!无需惊讶，你就是那个叛徒。在你的行踪败露之前，要尽快完成巫妖王交给你的任务。
 * 题目描述
 * 军团是一个几 行 m 列的矩阵，每个单元是一个血色先锋军的成员。感染瘟疫的人，每过一个小时，就会向你已经掌握了感染源的位置，任务是算出血色先锋军的领主四周扩散瘟疫，直到所有人全部感染上瘟疫。们感染瘟疫的时间，并且将它报告给巫妖王，以便对血色先锋军进行一轮有针对性的围剿。
 * 输入格式
 * 第1行:四个整数n，m，a，b，表示军团矩阵有几行m列。有a个感染源，b为血色敢死队中领主的数量。
 * 接下来 a 行:每行有两个整数 æ，y，表示感染源在第 x 行第 y列。
 * 接下来b行:每行有两个整数 ，y，表示领主的位置在第 行第 y 列。
 * 输出格式
 * 第1至b行:每行一个整数，表示这个领主感染瘟疫的时间，输出顺序与输入顺序一致。如果某个人的位置在感染源，那么他感染瘟疫的时间为 0。
 */
public class Main {
    static int N = 510;
    static int[][] g = new int[N][N];
    static int n;
    static int m;
    static int a;
    static int b;
    //static Queue<Node> q = new LinkedList<>();
    static Queue<int[]> q = new LinkedList<>();
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                g[i][j] = -1;
            }
        }
        for (int i = 1; i <= a; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            g[x][y] = 0;
            //q.add(new Node(x, y));
            q.add(new int[]{x, y});
        }
        bfs();
        int x;
        int y;
        for (int i = 1; i <= b; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println(g[x][y]);
        }
        sc.close();
    }

    public static void bfs() {
        while (!q.isEmpty()) {
            //Node cur = q.poll();
            //int x = cur.x;
            //int y = cur.y;
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            for (int i = 0; i < 4; i++) {
                int a = x + dx[i];
                int b = y + dy[i];
                if (a < 1 || a > n || b < 1 || b > n) {
                    continue;
                }
                if (g[a][b] != -1) {
                    continue;
                }
                g[a][b] = g[x][y] + 1;
                //q.add(new Node(a, b));
                q.add(new int[]{a, b});
            }
        }
    }
}

/*class Node {
    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int x, y;
}*/

