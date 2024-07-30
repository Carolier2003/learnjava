import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/16 18:48
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ans = count(n);
        System.out.printf("%.2f", ans);
    }

    private static double count(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 2 || n == 1) {
            return 1;
        }

        double[] dp = new double[n + 1];
        dp[1] = dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
