import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/9/26 22:53
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr = new int[m];
        int cf = 0;
        for (int i = 0; i < arr.length; i++) {
            int number = sc.nextInt();
            boolean flag = false;
            for (int j = 0; j <= i; j++) {
                if (arr[j] == number) {
                    flag = true;
                    cf++;
                    break;
                }
            }
            if (!flag) {
                arr[i - cf] = number;
            }
        }
        for (int i = 0; i < arr.length - cf - 1; i++) {
            for (int j = 0; j < arr.length - cf - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(arr.length - cf);
        for (int i = 0; i < arr.length - cf; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - cf - 1) {
                System.out.print(" ");
            }
        }
    }
}