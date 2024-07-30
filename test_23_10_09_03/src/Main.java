import java.util.Scanner;

/**
 * @author 19667
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bx, by, horseX, horseY;
        bx = sc.nextInt();
        by = sc.nextInt();
        horseX = sc.nextInt();
        horseY = sc.nextInt();

        int ways = calculatePaths(bx, by, horseX, horseY);
        System.out.println(ways);
    }

    private static int calculatePaths(int bx, int by, int horseX, int horseY) {
        int[][] dp = new int[bx + 1][by + 1];


        dp[0][0] = 1;


        for (int i = 1; i <= bx; i++) {
            if (i == horseX && 0 == horseY) {
                break;
            }
            dp[i][0] = dp[i - 1][0];
        }

        for (int j = 1; j <= by; j++) {
            if (0 == horseX && j == horseY) {
                break;
            }
            dp[0][j] = dp[0][j - 1];
        }


        for (int i = 1; i <= bx; i++) {
            for (int j = 1; j <= by; j++) {
                if ((i == horseX + 1 && j == horseY + 2) ||
                        (i == horseX + 2 && j == horseY + 1) ||
                        (i == horseX + 1 && j == horseY - 2) ||
                        (i == horseX + 2 && j == horseY - 1) ||
                        (i == horseX - 1 && j == horseY + 2) ||
                        (i == horseX - 2 && j == horseY + 1) ||
                        (i == horseX - 1 && j == horseY - 2) ||
                        (i == horseX - 2 && j == horseY - 1)) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        return dp[bx][by];
    }
}
