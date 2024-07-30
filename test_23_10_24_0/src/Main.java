import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/24 8:51
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int p = scanner.nextInt();

            double dis = Math.sqrt(x * x + y * y);
            sum += dis / 50 + p + dis / 50 + p * 0.5;
        }

        System.out.printf("%.0f", Math.ceil(sum));
    }
}