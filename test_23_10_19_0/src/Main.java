import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/19 15:55
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, x, y;
        x = sc.nextDouble();
        a = sc.nextDouble();
        y = sc.nextDouble();
        b = sc.nextDouble();
        System.out.printf("%.2f\n", 1.0 * ((x * a - y * b) / (a - b)));
    }
}