import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/15 15:35
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[][] arr = new int[2][length];
        for (int i = 0; i < arr[0].length; i++) {
            arr[0][i] = sc.nextInt();
            if (i == 0) {
                arr[1][i] = 0;
            } else {
                int count = 0;
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[0][j] < arr[0][i]) {
                        count++;
                    }
                }
                arr[1][i] = count;
            }
        }
        for (int i = 0; i < arr[1].length; i++) {
            System.out.print(arr[1][i]+" ");
        }
    }
}