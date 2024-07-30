import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/7 17:09
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int currentMoney = 0;
        int bankMoney = 0;
        int budget;
        int month = -1;
        boolean isPoof = false;
        for (int i = 0; i < 12; i++) {
            currentMoney += 300;
            budget = sc.nextInt();
            currentMoney -= budget;
            if (currentMoney < 0) {
                month = i + 1;
                isPoof = true;
                break;
            }
            if (currentMoney >= 100) {
                int money = currentMoney / 100 * 100;
                bankMoney += currentMoney / 100 * 100;
                currentMoney -= money;
            }
        }
        if (isPoof) {
            System.out.println(-month);
        } else {
            System.out.printf("%.0f\n", bankMoney * 1.2 + currentMoney);

        }
    }
}