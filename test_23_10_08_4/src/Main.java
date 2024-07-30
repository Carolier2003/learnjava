import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/8 20:15
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int length = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] > arr[i] && arr[i + 1] > arr[i]) {
                count++;
                length = 0;
                continue;
            }
            if (arr[i] == arr[i + 1]) {
                length++;
                continue;
            }
            if (arr[i] == arr[i - 1] && arr[i + 1] > arr[i] && arr[i - length-1] > arr[i-length]) {
                count++;
                length = 0;
            }
        }
        System.out.println(count);
    }
}