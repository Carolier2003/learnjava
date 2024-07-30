import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/15 11:19
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int i = 0;
        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            arr[i] = num;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
    }
}