package test2;

import java.util.Scanner;

public class StrTest {
    public static void main(String[] args) {
        // 请在Begin-End间编写代码
        /********** Begin **********/
        Scanner scanner = new Scanner(System.in);
        // 第一步：接收输入的两个字符串，第一个是文件名，第二个是邮箱地址
        String name = scanner.next();
        String emailAddress = scanner.next();
        // 第二步：判断文件名是否正确
        String nameB = name.substring(name.length() - 5);
        if (name.length() > 5 && nameB.equals(".java")) {
            System.out.println("Java文件名正确");
        } else {
            System.out.println("Java文件名无效");
        }
        // 第三步：判断邮箱地址是否正确
        char[] str = emailAddress.toCharArray();
        int flag1 = 0;
        int flag2 = 0;

        for (char c : str) {
            if (c == '@') {
                flag1 = 1;
                flag2 = 1;
            }
            if (c == '.') {
                flag2 = 0;
            }
        }
        if (flag1 == 0 || flag2 == 1) {
            System.out.println("邮箱名无效");
        } else {
            System.out.println("邮箱名正确");
        }
        /********** End **********/

    }
}
