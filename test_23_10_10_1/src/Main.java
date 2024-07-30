import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/10 18:16
 */
public class Main {
    public static void main(String[] args) {
        int bi = 19;
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int money = m * 10 + n;
        System.out.println(money / bi);
    }
}
