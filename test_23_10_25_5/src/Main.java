import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/25 23:19
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 7 == 0) {
                continue;
            }
            if (i % 10 == 7 || i / 10 % 10 == 7 || i / 100 == 7) {
                continue;
            }
            ans += (long) i * i;
        }
        System.out.println(ans);
    }
}