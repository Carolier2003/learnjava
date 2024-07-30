import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/22 13:16
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int ate = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] += sc.nextInt();
            ate += arr[i] % 3;
            arr[i] = arr[i] / 3;
            arr[(i+5-1)%5] += arr[i];
            arr[(i+5+1)%5] += arr[i];
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(ate);
    }
}