import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/25 17:37
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double e = 1.0;
        double sum = 1.0;

        for (int i = 1; i <= n; i++) {
            e *= i;
            sum += 1 / e;
        }

        System.out.printf("%.10f", sum);
    }
}