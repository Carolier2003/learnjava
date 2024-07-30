import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/15 16:39
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int unhappyDegree = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            unhappyDegree -= 8;
            unhappyDegree += sc.nextInt();
            unhappyDegree += sc.nextInt();
            sum += unhappyDegree;
        }
        System.out.println(sum);
    }
}