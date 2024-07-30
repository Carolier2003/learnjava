import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/16 21:45
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        char[] arr = words.toCharArray();
        int ans = 0;
        int[] table = new int[]{1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 1, 2, 3, 4};
        for (char i : arr) {
            if (i >= 'a' && i <= 'z') {
                ans += table[i - 'a'];
            }
            if(i==' ') {
                ans++;
            }
        }
        System.out.println(ans);
    }
}