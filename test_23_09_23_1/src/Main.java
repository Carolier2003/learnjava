import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/9/23 19:43
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length+1];
        int ciShu = sc.nextInt();
        for (int i = 0; i < ciShu; i++) {
            int begin = sc.nextInt();
            int end = sc.nextInt();
            kanShu(begin, end, arr);
        }
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                number++;
            }
        }
        System.out.println(number);
    }

    public static void kanShu(int begin, int end, int[] arr) {
        for (int i = begin; i <= end; i++) {
            arr[i] = 1;
        }
    }
}