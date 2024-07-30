import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/20 17:39
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        if (a == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}