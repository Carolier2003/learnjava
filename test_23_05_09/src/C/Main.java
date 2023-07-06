package C;

import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/5/9 19:17
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                if (i == j || i == (n - j - 1)) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
