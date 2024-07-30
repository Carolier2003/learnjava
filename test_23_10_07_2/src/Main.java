import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/7 18:04
 */
public class Main {
    public static void main(String[] args) {
        int cigarette, exchanges;
        int butt = 0;
        int cigaretteEd = 0;
        Scanner sc = new Scanner(System.in);
        cigarette = sc.nextInt();
        exchanges = sc.nextInt();
        while (cigarette != 0) {
            cigarette--;
            butt++;
            cigaretteEd++;
            if(butt==exchanges){
                cigarette++;
                butt=0;
            }
        }
        System.out.println(cigaretteEd);
    }
}