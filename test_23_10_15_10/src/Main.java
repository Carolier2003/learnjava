import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/15 20:29
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        String pascal = sc.nextLine();
        String[] progress = pascal.split(":=|;");
        for (int i = 0; i < progress.length-1; i += 2) {
            int number;
            switch (progress[i + 1]) {
                case "a":
                    number = a;
                    break;
                case "b":
                    number = b;
                    break;
                case "c":
                    number = c;
                    break;
                default:
                    number = Integer.parseInt(progress[i + 1]);
                    break;
            }
            switch (progress[i]) {
                case "a":
                    a = number;
                    break;
                case "b":
                    b = number;
                    break;
                case "c":
                    c = number;
                    break;
                default:
                    break;
            }
        }
        System.out.println(a+" "+b+" "+c);
    }
}