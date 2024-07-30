import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/15 19:56
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[10];
        for (int i = m; i <= n; i++) {
            int number = i;
            while (number != 0) {
                int a = number % 10;
                switch (a) {
                    case 0:
                        arr[0]++;
                        break;
                    case 1:
                        arr[1]++;
                        break;
                    case 2:
                        arr[2]++;
                        break;
                    case 3:
                        arr[3]++;
                        break;
                    case 4:
                        arr[4]++;
                        break;
                    case 5:
                        arr[5]++;
                        break;
                    case 6:
                        arr[6]++;
                        break;
                    case 7:
                        arr[7]++;
                        break;
                    case 8:
                        arr[8]++;
                        break;
                    case 9:
                        arr[9]++;
                        break;
                    default:
                        break;
                }
                number /= 10;
            }
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}