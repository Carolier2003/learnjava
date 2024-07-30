import java.util.Scanner;
/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/18 18:26
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long x = scanner.nextLong();
        long t = 0;

        for (long i = 1; i <= n; i++) {
            long b = i;
            while (b != 0) {
                long c = b % 10;
                b = b / 10;
                if (c == x) {
                    t++;
                }
            }
        }

        System.out.println(t);
    }
}
