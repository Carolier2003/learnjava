import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/8 19:41
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 4; i <= n; i += 2) {
            for (int j = 2; j < n / 2; j++) {
                if (isPrime(j) && isPrime(i - j)) {
                    if(j<i-j){
                        System.out.println(i+"="+j+"+"+(i-j));
                    }else{
                        System.out.println(i+"="+(i-j)+"+"+j);
                    }

                    break;
                }
            }
        }
    }

    private static boolean isPrime(int j) {
        for (int i = 2; i <= Math.sqrt(j); i++) {
            if (j % i == 0) {
                return false;
            }
        }
        return true;
    }
}