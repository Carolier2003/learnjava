/**
 * 任务：跟据键盘输入的分子和分母求出该分数的值。其中第一次输入的值为分子的值，第二次输入的值为分母的值，两次的值均为 int 型。
 * 类名为：Fraction
 */

import java.util.Scanner;
// 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码
/********** Begin **********/

// 创建一个名为 Fraction 的公开类
public class Fraction {

// 定义分数的两个属性 ：分子和分母
    int molecule;
    int denominator;

/**
 * 定义一个方法，该方法实现计算该分数的值，携带两个参数，分别为传来的分子和分母的值
 * 如果分母为0，不换行输出：分母不能为0
 * 如果分母不为0，将该分数的值四舍五入保留两位小数后输出
 * 输出格式为：该分数的值为xx
 */
    public void getAnser(int molecule, int denominator){
        this.molecule = molecule;
        this.denominator = denominator;
        if(denominator==0){
            System.out.print("分母不能为0");
        }else{
            System.out.printf("%.2f",molecule*1.0/denominator);
        }
    }


// 定义主方法
    public static void main(String[] args) {
// 获取键盘传来的分子和分母的值
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
// 在主方法中通过 Java 添加的无参构造方法定义一个对象
        Fraction fraction = new Fraction();
// 调用计算分数值的方法，将获取到的分子和分母分别传入该方法中
        fraction.getAnser(x,y);
    }

}
/********** End **********/

