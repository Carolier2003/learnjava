import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/26 23:20
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, f;
        char c;

        a = scanner.nextInt();
        b = scanner.nextInt();
        scanner.next();
        c = scanner.next().charAt(0);
        f = scanner.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (i != 0 && i != a - 1 && j != 0 && j != b - 1) {
                    System.out.print(f == 0 ? ' ' : c);
                } else {
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }
}