import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/8 13:50
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        for (int i = n; i <= m; i++) {
            int j = i;
            while(j!=0){
                if(j%10==2){
                    count++;
                }
                j /= 10;
            }
        }
        System.out.println(count);
    }
}