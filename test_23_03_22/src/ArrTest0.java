/*
任务：仔细阅读给出的代码框架及注释，在 Begin-End 间编写程序代码，求班级数学平均成绩，具体要求如下：
- 接收给定的数据（如：4，88，43，43，98，#...，其中第一个数代表数组长度，
  其余数代表班级所有人数学成绩，# 号用于终止接收数据），遇到 # 号终止接收；
- 求班级数学平均成绩，平均成绩用 double 类型表示。

注意：数字分隔符为中文逗号。

*/
import java.util.Scanner;

public class ArrTest0 {
    public static void main(String[] args) {
        // 请在Begin-End间编写代码
        /********** Begin **********/
        Scanner input = new Scanner(System.in);
        // 第一步：接收给定的第一个数，用于定义数组长度
        int n = input.nextInt();
        // 第二步：定义数组
        int [] arr = new int[n];
        // 第三步：把成绩赋值给数组元素
        int i = 0;
        while(input.hasNextInt()){
            arr[i] = input.nextInt();
            i++;
        }
        // 第四步：求所有成绩的和
        double sum = 0;
        for(i = 0; i < n;i++){
            sum += arr[i];
        }
        // 第五步：求平均成绩
        sum /= n;
        System.out.println("数学的平均成绩为；"+sum);
        /********** End **********/
    }
}