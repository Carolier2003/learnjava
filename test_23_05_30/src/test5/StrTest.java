package test5;
/**
 * {@code @Author} 19667
 * {@code @create} 2023/5/30 16:13
 */

import java.util.Scanner;

public class StrTest {

    public static void main(String[] args) {
        // 请在Begin-End间编写代码
        /********** Begin **********/

        // 第一步：接收给定的字符串
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        // 第二步：判断给定的字符串是否符合给定的规则，符合的话请输出该字符串
        String regex = "\\d[a-zA-Z][a-z]";
        if (input.matches(regex)) {
            System.out.println(input);
        } else {
            System.out.println(input + "不符合规则");
        }
        // 第三步：不符合的话请输出该字符串不符合规则

        /********** End **********/

    }
}
