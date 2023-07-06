package A;

import java.util.Scanner;

/**
 * {@code @Author} ${USER}
 * {@code @create} ${DATE} ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int m = n;
        while (n > 0) {
            arr[n - 1][n - 1] = n;
            for (int i = 0; i < n; i++) {
                arr[i][n - 1] = arr[n - 1][i] = n;
            }
            n--;
        }
        for (int i = 0; i < m; i++) {
            for (int j = m -1; j >= 0; j--) {
                System.out.print("  " + arr[i][j]);
            }
            System.out.println();
        }
    }
}