/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/16 18:21
 */
import java.util.Scanner;

public class Main {
    public static int myTime(String s) {
        int m = 0, t = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ':') {
                t = t * 10 + Character.getNumericValue(s.charAt(i));
            } else {
                m = m * 60 + t;
                t = 0;
            }
        }
        m = m * 60 + t;
        return m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time1, time2;
        long x, ans;
        time1 = scanner.next();
        time2 = scanner.next();
        x = scanner.nextLong();
        ans = (myTime(time2) - myTime(time1)) * x;
        System.out.println(ans);
        scanner.close();
    }
}
