import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/7 18:17
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = new int[5];
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        boolean isFound = false;
        for (int i = 10000; i <= 30000; i++) {
            arr[4] = i % 10;
            arr[3] = i / 10 % 10;
            arr[2] = i / 10 / 10 % 10;
            arr[1] = i / 10 / 10 / 10 % 10;
            arr[0] = i / 10 / 10 / 10 / 10 % 10;
            number1 = arr[0] * 100 + arr[1] * 10 + arr[2];
            number2 = arr[1] * 100 + arr[2] * 10 + arr[3];
            number3 = arr[2] * 100 + arr[3] * 10 + arr[4];
            if (number1 % k == 0 && number2 % k == 0 && number3 % k == 0){
                System.out.println(i);
                isFound = true;
            }
        }
        if(!isFound){
            System.out.println("No");
        }
    }
}