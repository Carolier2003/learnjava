import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/8 22:22
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = 3;
        for (int i = 0; i < n; i++) {
            String row = sc.nextLine();
            n = row.length();
            sb.append(row);
        }
        System.out.print(n + " ");
        String number = sb.toString();
        char[] charArr = number.toCharArray();
        int[] arr = new int[n * n];
        for (int i = 0; i < charArr.length; i++) {
            arr[i] = charArr[i] - 48;
        }
        int picture = 0;
        int count;
        for (int i = 0; i < arr.length; ) {
            count = 0;
            while (arr[i] == picture) {
                count++;
                i++;
                if(i==arr.length){
                    break;
                }
            }
            picture = Math.abs(picture - 1);
            System.out.print(count);
            if (i != arr.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
