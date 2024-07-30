import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/25 17:39
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        int n = sc.nextInt();
        double ans = 0;
        for (int i = 0; i <= n; i++) {
            ans += Math.pow(x, i);
        }
        System.out.printf("%.2f", ans);
        sc.close();
    }
}