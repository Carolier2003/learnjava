import java.util.Scanner;

/**
 * @author 19667
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[10001];

        for (int i = 2; i <= n; i++) {
            int i2 = i;
            for (int j = 2; j <= i; j++) {
                while (i2 % j == 0) {
                    a[j]++;
                    i2 /= j;
                }
            }
        }

        for (int i = 1; i <= 10000; i++) {
            if (a[i] != 0) {
                System.out.println(i + " " + a[i]);
            }
        }

        scanner.close();
    }
}
