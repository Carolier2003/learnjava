package test2;

import java.io.IOException;
import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/5/30 14:20
 */
public class FileTest {

    public static void main(String[] args) throws IOException {
        // 请在Begin-End间编写完整代码
        /********** Begin **********/
        Scanner scanner = new Scanner(System.in);
        // 接收给定的字符串（单词）
        String word = scanner.next();
        // 定义变量
        int asciiSum = 0;
        // 将字符串转为字节数组
        char []wordArray = word.toCharArray();
        // 累加单词中各字母的ASCII码值
        for(char c : wordArray){
            asciiSum += c;
        }
        // 输出累加值
        System.out.println(asciiSum);
        /********** End **********/

    }
}
