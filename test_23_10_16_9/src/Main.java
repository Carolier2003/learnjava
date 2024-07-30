import java.util.Scanner;

/**
 * @author 19667
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int jy = 0, lv = 0;
        double a, x, hp = 10;

        while (n-- > 0) {
            x = scanner.nextDouble();
            a = scanner.nextDouble();
            hp -= x;

            if (hp <= 0) {
                break;
            }

            jy += a;

            if (hp > 10) {
                hp = 10;
            }
        }


        int o = 1;
        while (jy >= o) {
            jy -= o;
            lv++;
            o *= 2;
        }

        System.out.println(lv + " " + jy);
    }
}
