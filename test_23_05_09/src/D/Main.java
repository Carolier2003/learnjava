package D;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/5/9 19:30
 */
public class Main {
    public static void main(String[] args) {
        int n = 716699;
        int m = n;
        n = (int)Math.sqrt(n);
        int a, b, exa = 0, exb = 716699;
        for (int i = 1; i <= n; i++) {
            if (m % i == 0) {
                a = i;
                b = m / i;
                if ((a + b) < (exa + exb)) {
                    exa = a;
                    exb = b;
                }
            }
        }
        System.out.println(exa+" "+exb);
    }
}
