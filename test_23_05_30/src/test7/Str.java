package test7;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/5/30 16:31
 */
import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        // 请在Begin-End间编写代码
        /********** Begin **********/

        // 第一步：接收给定的字符串
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 第二步：创建StringBuffer对象
        StringBuffer stringBuffer = new StringBuffer();

        // 第三步：切割字符串
        String[] words = input.split(" ");

        // 第四步：反转单词
        for (String word : words) {
            StringBuffer wordBuffer = new StringBuffer(word);
            wordBuffer.reverse();
            stringBuffer.append(wordBuffer).append(" ");
        }

        // 第五步：输出反转后的字符串
        System.out.println(stringBuffer.toString().trim());

        /********** End **********/
    }
}
