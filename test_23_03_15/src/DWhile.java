/*
任务：统计给定一列数的正数和负数个数
给定的数举例：-1 2 3 -4 %
其中%用于while中，判断输入结束
*/

import java.util.Scanner;

public class DWhile {
    public static void main(String[] args) {
        // 定义变量positive，并赋初值0,用于统计正数个数
        int positive=0;
        // 定义变量negative，并赋初值0，用于统计负数个数
        int negative=0;

        // 创建Scanner对象
        Scanner input = new Scanner(System.in);

        // 在do后的花括号中编写循环语句
        do{
            // 请在 Begin-End 间编写代码
            /********** Begin **********/
            // 第一步： 获取输入值
            int n = input.nextInt();
            // 第二步：判断输入值是否为正数，如果是，把正数个数变量positive加1
            if(n>0){
                positive++;
            }
            // 第三步：判断输入值是否为负数，如果是，把负数个数变量negative加1
            else if (n<0) {
                negative++;
            }

        }
        // 第四步：在while后判断条件，当输入值的下一个值为%时，终止循环
        while(input.hasNextInt());
        // 第五步：输出正数和复数个数，具体格式见预期输出
        System.out.println("正数个数为："+positive+"。"+"负数个数为："+negative);
        /********** End **********/

    }
}
