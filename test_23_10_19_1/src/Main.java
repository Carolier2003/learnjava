import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/19 16:10
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(n/m+" "+n%m);
    }
}