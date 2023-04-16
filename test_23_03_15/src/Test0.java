import java.util.Scanner;

public class Test0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%2d  ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
//已收到消息. 以下是一个打印杨辉三角形的示例代码，你可以在这个代码的基础上进行修改，以满足你的需求。请注意，这个代码是使用Java语言编写的，如果你使用的是其他语言，可能需要进行相应的修改。 ```java import java.util.Scanner;  ```
