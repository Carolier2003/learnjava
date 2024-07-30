import java.util.Arrays;
import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/31 21:56
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[100001];
        int m = -9999;
        int len = 1;

        a[0] = -3456497;

        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
            if (a[i] == a[i - 1]) {
                len++;
            } else {
                len = 1;
            }
            if (len > m) {
                m = len;
            }
        }

        System.out.println(m);
    }
}