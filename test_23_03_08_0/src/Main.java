import java.util.Arrays;
import java.util.Scanner;
/**
 * 任务：判断一个给定的 5 位数是否是一个回文数
 */
public class Main {
    /**
     * 请在下面的 Begin - End 之间按照注释中给出的提示编写正确的代码
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 声明 int 类型的变量 num ，用来获取控制台输入
        int num = scanner.nextInt();
        /* ********* Begin **********/
        // 第一步：获取个位数的数值
        int NUM = num;
        int Single_digits = num % 10;
        num/=10;
        // 第二步：获取十位数的数值
        int Ten_digits = num % 10;
        num/=10;
        // 第三步：获取百位数的数值
        int Hundreds_of_digits = num % 10;
        num/=10;
        // 第四步：获取千位数的数值
        int Thousands = num % 10;
        num/=10;
        // 第五步：获取万位数的数值
        int the_10000_digits = num % 10;
        num/=10;
        // 第六步：将获取的个位数值乘以 10000
        Single_digits*=10000;
        // 第七步：将获取的十位数值乘以 1000
        Ten_digits*=1000;
        // 第八步：将获取的百位数值乘以 100
        Hundreds_of_digits*=100;
        // 第九步：将获取的千位数值乘以 10
        Thousands*=10;
        // 第十步：将获取的万位数值乘以 1
        the_10000_digits*=1;
        // 第十一步：将第六、七、八、九、十步转换后的数值相加
        int sum = 0;
        sum = Single_digits+Ten_digits+Hundreds_of_digits+Thousands+the_10000_digits;
        // 第十二步：判断变量 num 是否等于第十一步的数值，如果等于，则在控制台输出“回文数”；反之，则输出“不是回文数”
        if(NUM==sum)
            System.out.println("回文数");
        else
            System.out.println("不是回文数");
        /* ********* End **********/
    }
}