import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        int k = sc.nextInt();
        int cnt3 = 0;

        while (m != 0) {
            if (m % 10 == 3) {
                cnt3++;
            }
            m /= 10;
        }

        if (cnt3 == k) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
