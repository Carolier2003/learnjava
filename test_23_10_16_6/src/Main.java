import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/16 22:21
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m, x, y;
        int[][] mp, finalArr;

        n = scanner.nextInt();
        m = scanner.nextInt();
        x = scanner.nextInt();
        y = scanner.nextInt();

        mp = new int[n + 1][m + 1];
        finalArr = new int[n + 1][m + 1];

        for (int i = 1; i <= x; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();

            for (int j = x1; j <= x2; j++) {
                for (int k = y1; k <= y2; k++) {
                    mp[j][k]++;
                    finalArr[j][k] = i;
                }
            }
        }

        for (int i = 1; i <= y; i++) {
            int checkx = scanner.nextInt();
            int checky = scanner.nextInt();
            if (mp[checkx][checky] == 0) {
                System.out.println("N");
            }
            else {
                System.out.println("Y " + mp[checkx][checky] + " " + finalArr[checkx][checky]);
            }
        }
    }
}