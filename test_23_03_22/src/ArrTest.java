import java.util.Arrays;
import java.util.Scanner;

public class ArrTest {
    public static void main(String[] args) {
        // 请在Begin-End间编写代码
        /********** Begin **********/
        // 接收给定的数据
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] arr = new int[n];
        int i = 0;
        while(input.hasNextInt()){
            arr[i] = input.nextInt();
            i++;
        }
        // 通过临时数组对原数组去重，最后将临时数组赋值给原数组
        int m = n ;
        int falg = 0;
        int k = 0;
        int [] b = new int[n];
        for (i = 0; i < n; i++) {
            falg = 0;
            for (int j = 0; j < m; j++) {
                if(arr[i]==b[j]){
                    falg = 1;
                    break;
                }
            }
            if(falg==0){
                b[k] = arr[i];
                k++;
            }
        }
        for (i = 0; i < k; i++) {
            System.out.println(b[i]);
        }
        // 打印去重后的数组值

        /********** End **********/

    }
}
