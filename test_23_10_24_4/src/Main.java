import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/24 16:37
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            a %= b;
            a *= 10;
        }

        a /= b;
        System.out.println(a);
    }
}