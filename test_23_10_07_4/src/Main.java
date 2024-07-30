import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/7 18:47
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        boolean jolly = false;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (i != 0) {
                arr[i - 1] = Math.abs(arr[i - 1] - arr[i]);
            }
            if (i == arr.length - 1) {
                arr[i] = 0;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (!find(i, arr)) {
                break;
            }
            jolly = true;
        }
        if(jolly){
            System.out.println("Jolly");
        } else {
            System.out.println("Not jolly");
        }
    }

    private static boolean find(int i, int[] arr) {
        for (int k : arr) {
            if (k == i) {
                return true;
            }
        }
        return false;
    }
}