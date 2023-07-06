package E;

import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/5/9 20:17
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            double distance = Math.sqrt(Math.pow((a-c),2)+Math.pow((b-d),2));
            System.out.printf("%.2f\n",distance);
        }
    }
}
