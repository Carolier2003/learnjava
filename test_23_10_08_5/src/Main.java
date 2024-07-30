import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/8 21:19
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n * n];
        int number = 0;
        for (int i = 0; i < arr.length; ) {
            int m = sc.nextInt();
            for (int j = 1; j <= m; j++) {
                arr[i] = number;
                i++;
            }
            number = Math.abs(number - 1);
        }
        for (int i = 1; i <= n * n; i++) {
            System.out.print(arr[i - 1]);
            if (i % n == 0 &&i != n*n){
                System.out.println();
            }
        }
    }
}