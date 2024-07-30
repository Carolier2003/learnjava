import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/15 17:30
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int square = 0;
        int rectangle = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int length = 1; length + j <= m; length++) {
                    for (int width = 1; width + i <= n; width++) {
						if(width==length){
                            square++;
                        }else {
                            rectangle++;
                        }
                    }
                }
            }
        }
        System.out.println(square+" "+rectangle);
    }
}