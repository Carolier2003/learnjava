/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/18 18:04
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            int j = scanner.nextInt();
            int k = scanner.nextInt();
            int m = j;
            int w = k;

            while (j < n) {
                j <<= 1;
                k <<= 1;
            }

            while (j > n) {
                j -= m;
                k -= w;
            }

            while (j < n) {
                j += m;
                k += w;
            }

            ans = Math.min(ans, k);
        }

        System.out.println(ans);
    }
}
