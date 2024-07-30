import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/16 21:24
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String progress = sc.nextLine();
        char[] arr = progress.toCharArray();
        int ok = 0;
        for (char i : arr) {
            if (i == '(') {
                ok++;
            } else if (i == ')') {
                ok--;
                if (ok < 0) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        if (ok == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}