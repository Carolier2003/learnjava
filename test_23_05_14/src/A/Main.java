package A;

import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/5/14 18:43
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int m = n;
        n = 1;
        while (m >= n) {
            arr[n - 1][n - 1] = m - n + 1;
            for (int i = 0; i < n; i++) {
                arr[i][n - 1] = arr[n - 1][i] = m - n + 1;
            }
            n++;
        }
        for (int i = 0; i < m; i++) {
            for (int j = m - 1; j > -1; j--) {
                System.out.print("  " + arr[i][j]);
            }
            System.out.println();
        }
    }
}
