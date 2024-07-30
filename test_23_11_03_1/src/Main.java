import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/11/3 0:10
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= n; i++) {
            String s = scanner.nextLine();
            if (s.length() > 0) {
                char firstChar = s.charAt(0);
                if (Character.isLowerCase(firstChar)) {
                    firstChar = Character.toUpperCase(firstChar);
                }
                StringBuilder formattedString = new StringBuilder().append(firstChar);

                for (int j = 1; j < s.length(); j++) {
                    char c = s.charAt(j);
                    if (Character.isUpperCase(c)) {
                        c = Character.toLowerCase(c);
                    }
                    formattedString.append(c);
                }
                System.out.println(formattedString.toString());
            }
        }
    }
}





