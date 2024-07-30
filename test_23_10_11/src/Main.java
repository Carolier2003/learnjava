import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/11 14:54
 */
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int step = 0;
        double length = 2;
        while(n > 0){
            step++;
            n-=length;
            length *= 0.98;
        }
        System.out.println(step);
    }
}