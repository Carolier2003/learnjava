package B;

import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/5/9 19:02
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int sum = 0;
        while (n != 0) {
            int temp;
            temp = n % 10;
            sum += Math.pow(temp, 3);
            n /= 10;
        }
        if (sum == m) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
