import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/8 19:11
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String comet = sc.nextLine();
        int cometNumber = 1;
        String group = sc.nextLine();
        int groupNumber = 1;
        for (int i = 0; i < comet.length(); i++) {
            char a = comet.charAt(i);
            cometNumber *= a - 64;
        }
        for (int i = 0; i < group.length(); i++) {
            char a = group.charAt(i);
            groupNumber *= a - 64;
        }
        if (cometNumber % 47 == groupNumber % 47) {
            System.out.println("GO");
        } else {
            System.out.println("STAY");
        }
    }
}