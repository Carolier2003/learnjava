import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/18 18:34
 */


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        System.out.println("  " + ch);
        System.out.println(" " + ch + ch + ch);
        System.out.println(ch + "" + ch + ch + ch + ch);
    }
}
