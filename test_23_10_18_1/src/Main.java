/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/18 18:11
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String in = scanner.next();

        for (int j = 0; j < in.length(); j++) {
            char originalChar = in.charAt(j);
            char encryptedChar = encryptChar(originalChar, n);
            System.out.print(encryptedChar);
        }
    }

    private static char encryptChar(char c, int shift) {

        return (char) ((((c - 'a') + shift) % 26 + 26) % 26 + 'a');
    }
}
