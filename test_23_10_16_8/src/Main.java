import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/16 22:56
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();

        for (int i = s;; i++) {
            int a, b, a1 = 0, b1 = 0;
            a = i;

            for (int j = 1; j <= Math.sqrt(a); j++) {
                if (a % j == 0) {
                    a1 = a1 + j + a / j;
                }
            }
            a1 = a1 - a;

            b = a1;
            for (int j = 1; j <= Math.sqrt(b); j++) {
                if (b % j == 0) {
                    b1 = b1 + j + b / j;
                }
            }
            b1 = b1 - b;

            if (a == b1 && a >= s && a != b) {
                System.out.println(a + " " + b);
                return;
            }
        }
    }
}