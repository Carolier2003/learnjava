import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/15 21:34
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int minSum = 0;
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            sum += arr[i];
            minSum = sum;
        }
        int move = 1;
        while (m - 1 + move < n) {
            sum -= arr[move-1];
            sum += arr[m - 1 + move];
            if (sum < minSum) {
                minSum = sum;
            }
            move++;
        }
        System.out.println(minSum);
    }
}