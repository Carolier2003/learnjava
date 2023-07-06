import java.util.Scanner;

public class Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println(0);
            System.out.print(0);
        }else {
            int arr[][] = new int[2][n];
            for (int i = 0; i < n; i++) {
                arr[0][i] = sc.nextInt();
                arr[1][i] = (i + 1);
            }
            for (int i = 0; i < n - 1; i++) {
                int temp, tempIndex;
                for (int j = 0; j < n - 1 - i; j++) {
                    if (arr[0][j] > arr[0][j + 1]) {
                        temp = arr[0][j];
                        tempIndex = arr[1][j];
                        arr[0][j] = arr[0][j + 1];
                        arr[1][j] = arr[1][j + 1];
                        arr[0][j + 1] = temp;
                        arr[1][j + 1] = tempIndex;
                    }
                }
            }
            double time = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i - 1; j >= 0; j--) {
                    time += arr[0][j];
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[1][i]);
                if (i != n - 1)
                    System.out.print(" ");
            }
            System.out.println();
            System.out.printf("%.2f", time / n);
        }
    }
}
