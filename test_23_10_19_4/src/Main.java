import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/19 22:07
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        System.out.printf("%.5f", (f - 32) / 9 * 5);
    }
}