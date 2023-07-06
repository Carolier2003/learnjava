package test1;

import java.util.Arrays;
import java.util.Scanner;

public class StrTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 第一步：获取输入值，第一个为整数，代表数组长度，最后一个为%，代表终止输入，中间的值为一组字符
        int length = scanner.nextInt();
        char[] charArray = new char[length];
        int index = 0;
        while (!scanner.hasNext("%")) {
            charArray[index] = scanner.next().charAt(0);
            index++;
        }

        // 第二步：对字符数组排序
        Arrays.sort(charArray);

        // 第三步：通过字符数组的方式创建字符串
        String sortedString = new String(charArray);

        // 第四步：输出字符串内容
        System.out.println(sortedString);
    }
}
