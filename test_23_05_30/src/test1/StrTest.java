package test1;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/5/30 13:34
 */
import java.util.Scanner;
public class StrTest {
    public static void main(String[] args) {
        // 请在Begin-End间编写代码
        /********** Begin **********/
        Scanner scanner = new Scanner(System.in);
        double v0 = 8;
        // 第一步：接收加速度
        double acceleration = scanner.nextDouble();
        // 第二步：接收时间
        double time = scanner.nextDouble();
        // 第三步：使用格式化字符串的方式输出距离
        double distance = v0*time+0.5*acceleration*Math.pow(time,2);
        System.out.printf("时间为%.0f，加速度为%.0f时， 距离为%f", time, acceleration, distance);
        /********** End **********/

    }
}
