import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/24 16:05
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int[] arr = new int[4];
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            for (int j = 0; j < 4; j++) {
                arr[j] = number % 10;
                number /= 10;
            }
            if ((arr[0] - arr[3] - arr[2] - arr[1]) > 0) {
                ans++;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}