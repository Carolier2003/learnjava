import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/9 21:45
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int maxCount = 0;
        int count;
        for (int i = 0; i < arr.length - 1; i++) {
            count = 0;
            while (arr[i + 1] == arr[i] + 1) {
                count++;
                i++;
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        System.out.println(maxCount);
    }
}
