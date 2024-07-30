package test9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/4/6 23:11
 * 题目描述
 * 呵呵，有一天我做了一个梦，梦见了一种很奇怪的电梯。大楼的每一层楼都可以停电梯，而且第i层楼(1 <i< N)上有一个数字 Ⅸ;(0< ;< N)。电梯只有四个按钮:开，关，上，下。上下的层数等于当前楼层上的那个数字。当然，如果不能满足要求，相应的按钮就会失灵。例如: 3,3,1,2,5 代表了K;(K1= 3，K= 3,…)，从1楼开始。在1楼，按”上"可以到 4楼，按"下"是不起作用的，因为没有 -2 楼。那么，从 4 楼到 B 楼至少要按几次按钮呢?
 * 输入格式
 * 共二行。
 * 第一行为三个用空格隔开的正整数，表示 N,A,B(1< N< 200,1< A,B<N)第二行为 N 个用空格隔开的非负整数，表示 ;。
 * 输出格式
 * 一行，即最少按键次数，若无法到达，则输出-1。
 * 输入输出样例
 * 输入 #1
 * 5 15
 * 复制
 * 输出#1
 * 3
 * 复制
 * 33125
 * 说明/提示
 * 对于 100%的数据，1≤N< 200,1≤ A, B≤ N,0≤K;< N.
 * 本题共 16 个测试点，前 15 个每个测试点6 分，最后一个测试点 10 分。
 */
public class Main {
    static int maxN = 201;
    //用于记录每层按钮的数组
    static int[] arr = new int[maxN];
    static int A, B, n;
    static int min = 2000000000;

    static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        dfs(A, 0);
        if (min == 2000000000) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }
    }

    /**
     * @param x 表示现在在第几层
     */
    public static void dfs(int x, int sum) {
        if (arrayList.contains(x) || sum > min) {
            return;
        }
        if (x == B) {
            if (sum < min) {
                min = sum;
            }
            return;
        }
        arrayList.add(x);
        if (x + arr[x] <= n) {
            dfs(x + arr[x], sum + 1);
        }
        if (x - arr[x] > 0) {
            dfs(x - arr[x], sum + 1);
        }
        arrayList.removeLast();
    }
}
