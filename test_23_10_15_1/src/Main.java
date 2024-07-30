import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/15 9:51
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s = sc.nextDouble();
        double x = sc.nextDouble();
        double journey = 0;
        double speed = 7;
        boolean dangerous = false;
        while (journey < (x + s)) {
            if ((journey >= (s - x) && journey < (s + x)) && (journey + speed*0.98 > (s - x) && journey + speed*0.98 <= (s + x))) {
                dangerous = true;
            }
            journey += speed;
            speed *= 0.98;
        }
        if (dangerous) {
            System.out.println("y");
        } else {
            System.out.println("n");
        }
    }
}