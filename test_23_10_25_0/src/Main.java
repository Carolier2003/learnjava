import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/25 12:12
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextInt();
        double ans = 0;
        ans += h;
        for (int i = 0; i < 9; i++) {
            h = h*0.5;
            ans += 2*h;
        }
        h *= 0.5;
        System.out.println(ans);
        System.out.println(h);
        sc.close();
    }
}