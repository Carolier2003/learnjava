package test3;


/*
本关任务：接收两个字符串，统计第二个字符串在第一个字符串里出现的次数。
输出样式：“出现的次数：x”。
*/


import java.util.Scanner;

public class StrTest {
    public static void main(String[] args) {
        // 请在Begin-End间编写代码
        /********** Begin **********/
        Scanner scanner = new Scanner(System.in);
        // 第一步：接收输入的第一个字符串
        String str1 = scanner.next();
        // 第二步：接收输入的第二个字符串
        String str2 = scanner.next();
        // 第三步：查找第二个字符串在第一个字符串中出现次数
        int count = 0;
        int lastIndex = 0;
        while(lastIndex != -1) {
            lastIndex = str1.indexOf(str2, lastIndex);
            if(lastIndex != -1){
                count++;
                lastIndex += str2.length();
            }
        }
        System.out.println("出现的次数是"+count);
        /********** End **********/

    }
}
