import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/30 23:33
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int c = scanner.nextInt();
            if (c <= 18) {
                a[1]++;
            }
            if (c >= 19 && c <= 35) {
                a[2]++;
            }
            if (c >= 36 && c <= 60) {
                a[3]++;
            }
            if (c > 60) {
                a[4]++;
            }
        }

        for (int i = 1; i <= 4; i++) {
            double percentage = (double) a[i] / n * 100;
            System.out.printf("%.2f%%\n", percentage);
        }
    }
}