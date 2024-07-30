package test6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static boolean[] st;
    static int n, m;
    static boolean flag = false;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st1.nextToken());
        m = Integer.parseInt(st1.nextToken());

        arr = new int[n + 1];
        st = new boolean[n + 1]; // 正确声明 st 数组用于标记手指是否被使用过

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        dfs(1);

        // 输出结果
        for (int i = 1; i <= n; i++) {
            bw.write(arr[i] + " ");
        }
        bw.newLine();

        br.close();
        bw.close();
    }

    public static void dfs(int x) {
        if (flag) {
            return;
        }
        if (x > n) {
            cnt++;
            if (cnt == m + 1) {
                flag = true;
                return;
            }
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!st[i]) {
                st[i] = true;
                arr[x] = i;
                dfs(x + 1);
                if (flag) {
                    return;
                }
                st[i] = false;
            }
        }
    }
}
