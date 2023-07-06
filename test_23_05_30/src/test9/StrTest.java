package test9;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/5/30 17:17
 */
import java.util.Scanner;

public class StrTest {

    public static void main(String[] args) {
        // 请在Begin-End间编写代码
        /********** Begin **********/

        // 第一步：接收给定的字符串
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // 第二步：创建StringBuffer对象反转字符串
        StringBuffer stringBuffer = new StringBuffer(input);
        String antiInput = stringBuffer.reverse().toString();
        // 第三步：判断反转后的字符串与原字符串是否相等
        if(input.equals(antiInput)){
            System.out.println(input+"是对称字符串");
        } else {
            System.out.println(input+"不是对称字符串");
        }

        /********** End **********/
    }
}

