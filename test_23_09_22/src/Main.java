import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/9/22 23:12
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = 1;
        double sn = 0;
        while(sn < k){
            sn += 1*1.0/n;
            if(sn>k){
                break;
            }
            n++;
        }
        System.out.println(n);
    }
}