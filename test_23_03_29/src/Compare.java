/**
 * 任务：比较键盘输入的两个 double 型的数值的大小，输出较大的值。
 * 类名为：Compare
 */

import java.util.Scanner;
// 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码
/********** Begin **********/

// 创建一个名为 Compare 的公开类
public class Compare {


// 分别定义两个数
    double a, b;

/**
 * 定义一个方法，该方法实现比较两数大小，携带两个参数，分别为传来的两个数的值
 * 将两个数中较大的那个数返回，返回类型为double
 */
    public double thanSize(double a, double b){
        this.a = a;
        this.b = b;
        if(a > b)
            return a;
        else
            return b;
    }

// 定义主方法
    public static void main(String[] args) {
// 获取键盘传来的两个数
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double m = sc.nextDouble();
// 在主方法中通过无参构造方法定义一个对象
        Compare compare = new Compare();
// 调用比较大小的方法，获得较大的那个数
        double max = compare.thanSize(n,m);
// 不换行输出较大的那个数
        System.out.print(max);
    }
}
/********** End **********/