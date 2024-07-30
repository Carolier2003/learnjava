import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/24 16:53
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 1;
        int[] arr = new int[3];
        for (int i = 0; i < b; i++) {
            ans = ans * a;
            for (int j = 0; j < 3; j++) {
                arr[j] = ans % 10;
                ans /= 10;
            }
            ans = 0;
            for (int j = 2; j >= 0; j--) {
                ans = ans * 10 + arr[j];
            }
        }
        System.out.println(arr[2] + String.valueOf(arr[1]) + arr[0]);
    }
}