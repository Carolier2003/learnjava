import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/8 19:58
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            number = Math.abs(number);
        }
        int rollbackNumber = 0;
        while (number != 0) {
            rollbackNumber *= 10;
            rollbackNumber += number % 10;
            number/=10;
        }
        if(isNegative){
            System.out.println(-rollbackNumber);
        } else {
            System.out.println(rollbackNumber);
        }
    }
}