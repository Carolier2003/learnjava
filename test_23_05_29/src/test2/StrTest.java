package test2;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/5/29 20:44
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StrTest {
    public static void main(String[] args) {
        // 请在Begin-End间编写代码
        /********** Begin **********/
        Scanner scanner = new Scanner(System.in);
        // 第一步：接收输入的字符串
        String input = scanner.nextLine().trim();
        scanner.close();
        // 第二步：对字符串做指定操作操作
        String words[] = input.split(",");
        int count = 0;
        List<String> matchedWords = new ArrayList<String>();
        for(String word : words) {
            word = word.trim();
            if(word.startsWith("a")&&word.endsWith("z")&&word.contains("li")) {
                count++;
                matchedWords.add(word);
            }
        }

        if (count > 0) {
            for (String word : matchedWords) {
                // 转化为小写并输出
                System.out.println("将符合条件的子字符串转化为小写：" + word.toLowerCase());

                // 转化为大写并输出
                System.out.println("将符合条件的子字符串转化为大写：" + word.toUpperCase());
            }
        } else {
            System.out.println("该字符串没有符合条件的子字符串");
        }

        // 输出符合条件的单词的总数
        System.out.println("字符串中共有符合条件的子字符串：" + count + "个");
        /********** End **********/
    }
}