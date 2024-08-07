package test10;

import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/4/7 9:48
 * 题目描述
 * M#复制Markdown[]展开
 * 不是任何人都可以进入桃花岛的，黄药师最讨厌像郭靖一样呆头呆脑的人。所以，他在桃花岛的唯一入口处修了一条小路，这条小路全部用正方形瓷砖铺设而成。有的瓷砖可以踩，我们认为是安全的，而有的瓷砖一踩上去就会有喷出要命的毒气，那你就死翘翘了，我们认为是不安全的。你只能从一块安全的瓷砖上走到与他相邻的四块瓷砖中的任何一个上，但它也必须是安全的才行。
 * 由于你是黄蓉的朋友，她事先告诉你哪些砖是安全的、哪些砖是不安全的，并且她会指引你飞到第一块砖上(第一块砖可能在任意安全位置)，现在她告诉你进入桃花岛的秘密就是:如果你能走过最多的瓷砖并且没有死，那么桃花岛的大门就会自动打开了，你就可以从当前位置直接飞进大门了。
 * 注意:瓷砖可以重复走过，但不能重复计数。
 * 输入格式
 * 第一行两个正整数 W 和 H，分别表示小路的宽度和长度。以下 H 行为一个 H xW 的字符矩阵。每一个字符代表一块瓷砖。其中，."代表安全的砖，#代表不安全的砖，@ 代表第一块砖。
 * 输出格式
 * 输出一行，只包括一个数，即你从第一块砖开始所能安全走过的最多的砖块个数(包括第一块砖)。
 */
public class Main {
    static int max = 21;
    //迷宫
    static char[][] maze = new char[max][max];

    static int W, H;
    static int ans = 0;
    static boolean[][] st = new boolean[max][max];
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        W = sc.nextInt();
        H = sc.nextInt();
        String[] temp = new String[H];
        for (int i = 0; i < H; i++) {
            temp[i] = sc.next();
        }
        for (int i = 0; i < H; i++) {
            maze[i] = temp[i].toCharArray();
        }
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (maze[i][j] == '@') {
                    ans++;
                    dfs(i, j);
                }
            }
        }
        sc.close();
        System.out.println(ans);
    }

    /**
     * @param x 横坐标
     * @param y 纵坐标
     */
    public static void dfs(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int a = x + dx[i], b = y + dy[i];
            if (a < 0 || a >= H || b < 0 || b >= W) {
                continue;
            }
            if(maze[a][b]!='.'){
                continue;
            }
            if(st[a][b]){
                continue;
            }

            //走a,b这个点
            st[a][b] = true;
            ans++;
            dfs(a,b);
        }
    }
}
