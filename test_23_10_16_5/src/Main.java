/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/16 21:53
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m, k, a, b, ans;
        int[][] s;

        n = scanner.nextInt();
        m = scanner.nextInt();
        k = scanner.nextInt();

        s = new int[n + 1][n + 1];

        for (int i = 1; i <= m + k; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();

            for (int x = -2; x <= 2; x++) {
                for (int y = -2; y <= 2; y++) {
                    if ((i > m || Math.abs(x) + Math.abs(y) <= 2) && isValid(a + x, b + y, n)) {
                        s[a + x][b + y]++;
                    }
                }
            }
        }

        ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (s[i][j] == 0) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }

    private static boolean isValid(int x, int y, int n) {
        return x >= 1 && y >= 1 && x <= n && y <= n;
    }
}
