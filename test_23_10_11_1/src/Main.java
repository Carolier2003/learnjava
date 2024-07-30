import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/11 15:29
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        int time = sc.nextInt();
        long mile = 0;
        for (int i = 0; i < time; i++) {
            if (week % 6 != 0 && week % 7 != 0) {
                mile += 250;
            }
            week = (week % 7) + 1;
        }
        System.out.println(mile);
    }
}