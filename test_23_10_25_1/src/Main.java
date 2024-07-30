import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/25 12:21
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        while (n != 1) {
            if (n % 2 == 1) {
                System.out.println(n + "*3+1=" + (n * 3 + 1));
                n = n * 3 + 1;
            } else {
                System.out.println(n + "/2=" + (n / 2));
                n /= 2;
            }
        }
        System.out.println("End");
    }
}