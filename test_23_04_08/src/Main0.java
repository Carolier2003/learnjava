import java.util.Scanner;

public class Main0 {
    public static void main(String[] args) {
        // your code
        Scanner sc =new Scanner(System.in);
        int m = sc.nextInt();
        int arr[][] = new int[m][m];
        int e = 0, s = m - 1, w = m - 1, n = 0;
        int control = m, number = 1;
        while(control > 0){
            for (int i = (0+e); i < control - 1 + e; i++) {
                arr[e][i] = number++;
            }
            for (int i = (0+e); i < control - 1 + e; i++) {
                arr[i][s] = number++;
            }
            for (int i = control - 1 + e; i > (e+0); i--) {
                arr[w][i] = number++;
            }
            for (int i = control - 1 + e; i > (e+0); i--) {
                arr[i][n] = number++;
            }
            e++;
            s--;
            w--;
            n++;
            control -= 2;
        }
        if(m % 2 == 1){
            arr[m/2][m/2] = number;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%4d",arr[i][j]);
            }
            System.out.println();
        }
    }
}
// your code