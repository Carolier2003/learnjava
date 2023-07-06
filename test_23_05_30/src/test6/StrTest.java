package test6;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/5/30 16:25
 */
import java.util.Scanner;
public class StrTest {
    public static void main(String[] args) {
        // 请在Begin-End间编写代码
        /********** Begin **********/
        // 接收给定的字符串
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        // 分割字符串
        String[] parts = input.split("@");
        String number = parts[0];
        // 判断给定字符串中的数字是否属于手机号码，是的话请输出：“X是手机号码”
        String regex = "(133|149|153|173|177|180|181|189|130|131|132|145|155|156|166|175|176|185|186|134|135|136|137|138|139|147|150|151|152|157|158|159|178|182|183|184|187|188)\\d{8}";
        if (number.matches(regex)) {
            System.out.println(number + "是手机号码");
        } else {
            System.out.println(number + "不是手机号码");
        }
        // 不符合的话请输出:“X是不手机号码”

        /********** End **********/
    }
}
