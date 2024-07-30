import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/19 22:12
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r1 = sc.nextDouble();
        double r2 = sc.nextDouble();
        System.out.printf("%.2f", 1.0 / (1 / r1 + 1 / r2));
    }
}