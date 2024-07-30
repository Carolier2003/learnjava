import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/19 16:24
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.printf("%.3f%%",b*100/a);
    }
}