/*
任务：接收一个整数，判断该数是否是完数。
完数的定义：一个数如果恰好等于它的因子之和（本身除外），这个数就称为完数。
例如数字6，其因子为1，2，3，6（本身除外），满足1+2+3=6，所以这个数为完数。
如果是完数，请输出：x是完数
如果不是完数，请输出：x不是完数
具体输出样式见预期输出。
*/

import java.util.Scanner;

public class ForTest {
    public static void main(String[] args) {
        // 定义变量sum，用于求因子的和，并赋初值为0
        int sum=0;
        // 创建Scanner对象
        Scanner input = new Scanner(System.in);
        // 获取输入值
        int x = input.nextInt();
        // 请在 Begin-End 间编写代码

        /********** Begin **********/
        // 第一步：使用for循环判断获取的整数是否为完数
        int i = 0;
        for (i = 1; i < x; i++) {
            if (x % i == 0)
                sum += i;
        }
            // 第二步：如果是完数，请输出x是完数
            if(sum==i)
                System.out.println(x+"是完数");
            // 第三步：如果不是，请输出x不是完数
            else
                System.out.println(x+"不是完数");

        /********** End **********/

    }
}
