import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/15 15:57
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number1 = sc.nextLine();
        String number2 = sc.nextLine();
        String[] num1 = number1.split("/");
        String[] num2 = number2.split("/");
        int a = Integer.parseInt(num1[0]);
        int b = Integer.parseInt(num1[1]);
        int c = Integer.parseInt(num2[0]);
        int d = Integer.parseInt(num2[1]);
        int ans1 = a * c;
         int ans2 = b * d;
        if (ans1 < ans2) {
            int temp = ans1;
            ans1 = ans2;
            ans2 = temp;
        }
        int ans3;
        while ((ans1 % ans2) != 0) {
            ans3 = ans1 % ans2;
            ans1 = ans2;
            ans2 = ans3;
        }
        ans3 = ans2;
        ans1 = a * c / ans3;
        ans2 = b * d / ans3;
        System.out.println(ans2+" "+ans1);
    }
}