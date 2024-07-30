import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/24 16:21
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        for (int i = 2; i <= a && i <= b && i <= c; i++) {
            if (a % i == b % i && b % i == c % i) {
                System.out.println(i);
                return;
            }
        }
    }
}