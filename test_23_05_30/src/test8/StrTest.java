package test8;

import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/5/30 16:52
 */
public class StrTest {

    public static void main(String[] args) {
        // 请在Begin-End间编写代码
        /********** Begin **********/
        Scanner scanner = new Scanner(System.in);
        // 接收给定的字符串
        String str = scanner.nextLine();
        // 创建StringBuffer对象
        for (int num1 = 8; num1 <= 12; num1++) {
            StringBuffer stringBuffer = new StringBuffer(str);
            int index1 = stringBuffer.indexOf("(");
            int index2 = stringBuffer.indexOf("(", index1 + 1);
            stringBuffer.insert(index1 + 1, num1);
            int n = 1;
            if (num1 >= 10) {
                n = 2;
            }
            stringBuffer.insert(index2 + 1 + n, num1 + 10);
            System.out.println(stringBuffer);
        }

        // 添加数字并输出添加数字后的字符串

        /********** End **********/
    }
}
