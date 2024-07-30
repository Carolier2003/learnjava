import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/17 15:45
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < m; i++) {
            System.out.print((n - sum) / (m - i)+" ");
            sum += (n - sum) / (m - i);
        }
    }
}