import java.util.Scanner;

/**
 * 任务：变量 p 为每公里每吨货物的基本运费，
 * 变量 w 为货物重量，s 为运输距离，d 为折扣，
 * 根据题目中的总运输费用的计算公式，计算出总运输费用，将结果四舍五入后保留两位小数输出。
 * 类名为：Logistics
 */

public class Logistics {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        double p = reader.nextDouble();     // 表示每公里每吨货物的基本运费
        double w = reader.nextDouble();     // 表示货物重量
        double s = reader.nextDouble();     // 运输距离
        double d = 0.0;// 折扣
        // 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码
        /********** Begin **********/
        double exp ;
        if(s>0&&s<250){
            d = 0.00;
        } else if (s<500) {
            d = 0.02;
        } else if (s<1000) {
            d = 0.05;
        } else {
            d = 0.08;
        }
        exp = p*w*s*(1-d);
        System.out.printf("%.2f",exp);
        // 第一步：判断该运输距离的折扣为多少 如果0 < s < 250，则折扣为0，根据总运输费用的计算公式，计算出总运输费用，将结果四舍五入后保留两位小数输出。


        // 第二步：如果250 ≤ S < 500，则折扣为0.02，根据总运输费用的计算公式，计算出总运输费用，将结果四舍五入后保留两位小数输出。

        // 第三步：如果500 ≤ S < 1000，则折扣为0.05，根据总运输费用的计算公式，计算出总运输费用，将结果四舍五入后保留两位小数输出。


        // 第四步：如果1000 ≤ S，则折扣为0.08，根据总运输费用的计算公式，计算出总运输费用，将结果四舍五入后保留两位小数输出。


        /********** End **********/

    }
}
