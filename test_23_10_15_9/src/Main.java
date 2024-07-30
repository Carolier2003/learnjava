import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/15 20:11
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxDay = 0;
        int[] arr = new int[n];
        int day = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (i != 0 && arr[i] > arr[i - 1]) {
                day++;
                if (day > maxDay) {
                    maxDay = day;
                }
            } else {
                if (day > maxDay) {
                    maxDay = day;
                }
                day = 1;
            }
        }
        System.out.println(maxDay);
    }
}