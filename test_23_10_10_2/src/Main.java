import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/10 18:23
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("%.1f", money(n));
    }

    private static double money(int n) {
        if (n > 401) {
            return 150 * 0.4463 + 250 * 0.4663 + (n - 400) * 0.5663;
        } else if (n > 150) {
            return 150 * 0.4463 + (n - 150) * 0.4663;
        } else {
            return n * 0.4463;
        }
    }
}