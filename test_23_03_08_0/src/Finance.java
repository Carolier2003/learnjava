/**
 * 任务：编写程序，读入投资额、年利率和投资年限，利用题目所给公式计算投资的未来价值
 * 类名为：Finance
 */
// 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码
/********** Begin **********/

// 第一步：导入Scanner类
import java.util.Scanner;
// 第二步：创建一个名为 Finance 的公开类
public class Finance {
    // 第三步：定义主方法
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // 第四步：在主方法中，根据题目给出的计算投资的未来价值公式来计算未来价值
        double Investment = reader.nextDouble();
        double rate = reader.nextDouble();
        int year = reader.nextInt();
        double Future_value = Investment*(Math.pow(1+(rate/12),12*year));
        // 第五步：格式化输出未来价值，结果保留两位小数
        System.out.printf("%.2f",Future_value);

/********** End **********/
    }
}
