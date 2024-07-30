import static java.lang.Math.pow;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/7/27 23:26
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 10000; i <= 99999; i++) {
            int sum = 0;
            sum += pow(i % 10, 5);
            sum += pow( i / 10 % 10, 5);
            sum += pow( i / 100 % 10, 5);
            sum += pow( i / 1000 % 10, 5);
            sum += pow( i / 10000 % 10, 5);
            if (sum == i) {
                System.out.println(sum);
            }
        }
        System.out.println("Hello world!");
    }
}