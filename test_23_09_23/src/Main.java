import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/9/23 19:17
 */
public class Main {
    public static void main(String[] args) {
        int[]arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr[i]=sc.nextInt();
        }
        int length = sc.nextInt();
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<=30+length){
                number++;
            }
        }
        System.out.println(number);
    }
}