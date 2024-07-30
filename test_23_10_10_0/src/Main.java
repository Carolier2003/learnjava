import java.util.Scanner;

/**
 * @author 19667
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // B点的x坐标
        int m = scanner.nextInt();  // B点的y坐标
        int horseX = scanner.nextInt();  // 马的x坐标
        int horseY = scanner.nextInt();  // 马的y坐标
        scanner.close();

        long[][] dp = new long[n + 1][m + 1];
        dp[0][0] = 1;

        // 初始化马的控制点
        int[][] horseControlPoints = {
                {-1, -2}, {-2, -1}, {-2, 1}, {-1, 2},
                {1, -2}, {2, -1}, {2, 1}, {1, 2}
        };

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == horseX && j == horseY) {
                    // 如果是马的位置或马的控制点，则路径数为0
                    dp[i][j] = 0;
                } else {
                    if (i > 0) {dp[i][j] += dp[i - 1][j];}
                    if (j > 0) {dp[i][j] += dp[i][j - 1];}
                }

                // 减去马的控制点对应的路径数
                for (int[] controlPoint : horseControlPoints) {
                    int controlX = horseX + controlPoint[0];
                    int controlY = horseY + controlPoint[1];
                    if (controlX >= 0 && controlX <= n && controlY >= 0 && controlY <= m) {
                        dp[controlX][controlY] = 0;
                    }
                }
            }
        }

        System.out.println(dp[n][m]);
    }
}
