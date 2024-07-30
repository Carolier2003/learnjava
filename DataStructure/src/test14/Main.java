package test14;

import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/4/8 22:38
 * 题目描述
 * 单词接龙是一个与我们经常玩的成语接龙相类似的游戏，现在我们已知一组单词，且给定一个开头的字母，要求出以这个字母开头的最长的“龙”(每个单词都最多在“龙”中出现两次)，在两个单词相连时，其重合部分合为一部分，例如 beast 和 astonish，如果接成一条龙则变为 beastonish ，另外相邻的两部分不能存在包含关系，例如at和atide间不能相连。
 * 输入格式
 * 输入的第一行为一个单独的整数n 表示单词数，以下, 行每行有一个单词，输入的最后一行为一个单个字符，表示“龙”开头的字母。你可以假定以此字母开头的“龙”一定存在。
 * 输出格式
 * 只需输出以此字母开头的最长的“龙”的长度。
 */
public class Main {
    static int N = 30;
    static String[] words = new String[N];
    static int[] used = new int[N];
    static int[][] g = new int[N][N];
    static int ans = 0;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        //算出每个单词可以拼接的单词
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int a = words[i].length();
                int b = words[j].length();
                for (int k = 1; k < Math.min(a, b); k++) {
                    if (words[i].substring(a - k).equals(words[j].substring(0, k))) {
                        g[i][j] = k;
                        break;
                    }
                }
            }
        }
        char start = sc.next().charAt(0);
        sc.close();
        for (int i = 0; i < n; i++) {
            if (start == words[i].charAt(0)) {
                dfs(words[i], i);
            }
        }
        System.out.println(ans);
    }

    public static void dfs(String dragon, int x) {
        ans = Math.max(ans, dragon.length());
        used[x]++;
        for (int i = 0; i < n; i++) {
            if (g[x][i] != 0 && used[i] < 2) {
                String temp = dragon + words[i].substring(g[x][i]);
                dfs(temp, i);
            }
        }
        used[x]--;
    }
}
