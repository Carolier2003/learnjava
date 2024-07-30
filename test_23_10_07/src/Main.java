import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/7 16:41
 */
public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[2][7];
        Scanner sc = new Scanner(System.in);
        boolean happy = true;
        int day = 0;
        int time = 0;
        for (int i = 0; i < 7; i++) {
            arr[0][i] = sc.nextInt();
            arr[1][i] = sc.nextInt();
            if (arr[0][i] + arr[1][i] > 8) {
                happy = false;
                if(arr[0][i] + arr[1][i]>time){
                    time = arr[0][i] + arr[1][i];
                    day = i + 1;
                }
            }
        }
        if (happy) {
            System.out.println("0");
        } else {
            System.out.println(day);
        }
    }
}