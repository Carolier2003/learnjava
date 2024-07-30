import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/15 9:36
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if(d-b<0){
            c--;
            d+=60;
        }
        System.out.println((c-a)+" "+(d-b));
    }
}