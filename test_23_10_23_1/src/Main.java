import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/23 19:43
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        if (x >= -1 && x <= 1 && y >= -1 && y <= 1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        input.close();
    }
}