package test4;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/5/30 15:31
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class StrTest {
    public static void main(String[] args) {
        // 请在Begin-End间编写代码
        /********** Begin **********/
        // 接收给定的话费清单（由三行组成）
        Scanner scanner = new Scanner(System.in);
        String[] lines = new String[3];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = scanner.nextLine();
        }
        // 拼接三行字符串
        StringBuilder sb = new StringBuilder();
        for (String line : lines) {
            sb.append(line).append("\n");
        }
        String bill = sb.toString();
        // 分隔字符串，累加每种物品的价格
        double totalAmount = 0;
        String[] tokens = bill.split("\n");
        for (String token : tokens) {
            token = token.substring(0, token.length()-1);
            String[] parts = token.split("：");
            double amount = Double.parseDouble(parts[1]);
            totalAmount += amount;
        }
        // 输出话费总额
        System.out.println("话费总额为：" + totalAmount);
        /********** End **********/
    }
}

