package test5;

import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/4/6 13:42
 * 人类终于登上了火星的土地并且见到了神秘的火星人。人类和火星人都无法理解对方的语言，但是我们的科学家发明了一种用数字交流的方法。这种交流方法是这样的，首先，火星人把一个非常大的数字告诉人类科学家，科学家破解这个数字的含义后，再把一个很小的数字加到这个大数上面，把结果告诉火星人作为人类的回答。
 * 火星人用一种非常简单的方式来表示数字--掰手指。火星人只有一只手，但这只手上有成千上万的手指，这些手指排成一列，分别编号为1,2,3，…。火星人的任意两根手指都能随意交换位置，他们就是通过这方法计数的。
 * -个火星人用一个人类的手演示了如何用手指计数。如果把五根手指--拇指、食指、中指、无名指和小指分别编号为 1.2.3.4和 5，当它们按正常顺序排列时，形成了5 位数 12345，当你交换无名指和小指。位置时，会形成5位数 12354，当你把五个手指的顺序完全颠倒时，会形成 54321，在所有能够形成的120 个5位数中，12345 最小，它表示1;12354第二小，它表示2;54321最大，它表示 120。下表示了只有 3 根手指时能够形成的 6 个3 位数和它们代表的数字!
 * 三进制数
 * 代表的数字
 * 123
 * 132
 * 213
 * 231
 * 312
 * 321
 * m
 * 4
 * 白
 * 6
 * 现在你有幸成为了第一个和火星人交流的地球人。一个火星人会让你看他的手指，科学家会告诉你要加上去得很小的数。你的任务是，把火星人用手指表示的数与科学家告诉你的数相加，并根据相加的结果改变火星人手指的排列顺序。输入数据保证这个结果不会超出火星人手指能表示的范围。
 * 输入格式
 * 共三行。第一行一个正整数 N，表示火星人手指的数目(1< N< 10000)第二行是一个正整数 M，表示要加上去的小整数(1 < M < 100)。下一行是 1到 N 这 N 个整数的一个排列，用空格隔开，表示火星人手指的排列顺序
 * 输出格式
 * N 个整数，表示改变后的火星人手指的排列顺序。每两个相邻的数中间用一个空格分开，不能有多余的空格。
 */
public class Main {
    static int maxN = 10001;
    static int[] arr = new int[maxN];
    static boolean[] st = new boolean[maxN];
    static int n, m;
    static int cnt=0;

    static int[] target = new int[maxN];
    static boolean flag = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            target[i] = sc.nextInt();
        }
        sc.close();
        dfs(1);
    }

    public static void dfs(int x) {
        if(flag){
            return;
        }
        if (x > n) {
            cnt++;
            if(cnt==m+1){
                for (int i = 1; i <= n; i++) {
                    System.out.print(arr[i]+" ");
                }
                flag = true;
            }
            return;
        }
        for (int i = 1; i <= n; i++) {
            if(cnt==0){
                i = target[x];
            }
            if (!st[i]) {
                st[i] = true;
                arr[x] = i;
                dfs(x+1);
                st[i] = false;
                arr[x] = 0;
            }
        }
    }
}
