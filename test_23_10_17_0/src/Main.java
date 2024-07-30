/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/17 0:00
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        for (int i = 1; i * i <= n; i++) {
            System.out.print(i * i + " ");
        }
    }
}
