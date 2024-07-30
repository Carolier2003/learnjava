import java.util.Arrays;
import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/17 15:57
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int fenZi = arr[0];
        int fenMu = arr[2];
        int a = fenZi;
        int b = fenMu;
        while ((a % b) != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        System.out.println(fenZi/b+"/"+fenMu/b);
    }
}