package test3;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/5/30 14:44
 */
import java.util.Scanner;
import java.util.StringTokenizer;

public class StrTest {

    public static void main(String[] args) {
        // 请在Begin-End间编写代码
        /********** Begin **********/
        Scanner scanner = new Scanner(System.in);
        // 第一步：接收给定的购物小票字符串（由四行组成）
        String[] lines = new String[4];
        for (int i = 0; i < 4; i++) {
            lines[i] = scanner.nextLine();
        }
        // 第二步：拼接四行字符串
        StringBuilder sb = new StringBuilder();
        for(String line : lines) {
            sb.append(line).append("\n");
        }
        String receipt = sb.toString();
        // 第三步：分隔字符串，累加每种商品的价格
        int totalAmount = 0;
        String[] tokens = receipt.split("\n");
        for(String token : tokens){
            String[] parts = token.split("：");
            String amountStr = parts[1];
            int amount = Integer.parseInt(amountStr);
            totalAmount += amount;
        }
        // 第四步：输出总金额
        System.out.println("购物小票总金额：" + totalAmount);
        /********** End **********/

    }
}


