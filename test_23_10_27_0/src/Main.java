import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/27 9:23
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        String c = scanner.nextLine();
        c = c.replace(" ", "");
        for (int i = 0; i < c.length(); i++) {
            if (i != 0 && c.charAt(i) != '0') {
                System.out.print("+");
            }
            if (c.charAt(i) == '0') {
                continue;
            }
            System.out.print(c.charAt(i) + "*" + m + "^" + (c.length() - i - 1));
        }
        System.out.println();
    }
}