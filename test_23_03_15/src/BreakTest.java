/*
任务：判断给定的任意一个大于 1 的正整数是否是素数。
素数的定义：在大于 1 的自然数中，除了 1 和它本身以外不再有其他因数的自然数。
思路：接收给定的正整数n，从2到n对该数取余，如果存在余数为零，那么该数不为素数，否则就是素数
      
如果不是：请输出“x不是一个素数”。
如果是：请输出“x是一个素数”。

*/
import java.util.Scanner;

public class BreakTest {
    public static void main(String[] args) {

        // 请在Begin-End间编写代码
        /********** Begin **********/
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int flag = 0;
        int i = 0;
        for (i = 2; i < x; i++) {
            if(x%i==0)
                flag = 1;
        }
        if(x==2)
            flag = 0;
        if(flag==0)
            System.out.println(x+"是一个素数");
        else
            System.out.println(x+"不是一个素数");

        /********** End **********/

    }
}