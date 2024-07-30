import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/9/27 23:20
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = 0;
        for (; i < number; i++) {
            if(isPrime(i)&&number%i==0){
                break;
            }
        }
        System.out.println(number/i);
    }
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}