import java.math.BigInteger;
import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/16 18:25
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        BigInteger sum = BigInteger.valueOf(1);
        for (int i = 0; i < n; i++) {
            sum = sum.multiply(BigInteger.valueOf(x + 1));
        }
        System.out.println(sum);
    }
}
