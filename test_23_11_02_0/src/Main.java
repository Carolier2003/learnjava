import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/11/2 12:31
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            char nextChar = inputString.charAt((i + 1) % inputString.length());
            char newChar = (char) (currentChar + nextChar);
            result.append(newChar);
        }

        System.out.println(result);
    }
}