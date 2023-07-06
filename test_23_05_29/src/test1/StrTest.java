package test1;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/5/29 20:14
 */
import java.util.Scanner;
public class StrTest {
    public static void main(String[] args) {
        // 请在Begin-End间编写代码
        /********** Begin **********/
        // 第一步：接收输入的两份花名册
        Scanner scanner = new Scanner(System.in);
        String roster1 = scanner.nextLine();
        String roster2 = scanner.nextLine();
        // 第二步：输出第一份花名册的长度（字符串长度）
        System.out.println(roster1.length());
        // 第三步：输出第二份花名册的长度（字符串长度）
        System.out.println(roster2.length());
        // 第四步：判断两个花名册是否相同，若相同，请输出相同，若不同，请输出不相同
        if (roster1.equals(roster2)) {
            System.out.println("相同");
        } else {
            System.out.println("不相同");
        }
        /********** End **********/
    }
}
