import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/3 21:12
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int min = min(arr, arr.length);
        System.out.println(min);
    }

    public static int min(int[] arr, int length) {
        int temp = 0;
        if (length == 1) {
            return arr[0];
        } else {
            temp = min(arr, length - 1);
            if (temp <= arr[length - 1]) {
                return temp;
            } else {
                return arr[length - 1];
            }
        }
    }
}