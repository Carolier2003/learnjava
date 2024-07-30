import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/24 15:52
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inventory = sc.nextInt();
        int number = sc.nextInt();
        int cant = 0;
        for (int i = 0; i < number; i++) {
            int need = sc.nextInt();
            if (need <= inventory) {
                inventory -= need;
            } else {
                cant++;
            }
        }
        System.out.println(cant);
        sc.close();
    }
}