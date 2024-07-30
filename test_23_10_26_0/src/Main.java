import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/26 23:12
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int c, d, ans = 0;

        for (int i = L; i <= R; i++) {
            c = i;
            while (c != 0) {
                d = c % 10;
                c = c / 10;
                if (d == 2) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}