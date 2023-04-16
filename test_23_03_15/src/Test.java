/*
* 任务：从控制台获取输入的正整数n，打印带有n行的杨辉三角形
* 每个数字保证最少5个宽度，每行前面保证2n个宽度
杨辉三角形的特点：
- 第 n 行有 n 个数字；
- 每一行的开始和结尾数字都为 1；
- 从第 3 行起，除去每一行的开始和结尾数字，其余每个数都满足以下条件：任意一个数等于上一行同列和上一行前一列的和，
如以下杨辉三角形中第 3 行第 2 列中的 2 等于它上一行同列（第 2 行第 2 列中的 1）和上一行前一列（第 2 行第 1 列中的 1）的和。
以下是有5行的杨辉三角形：
             1
           1   1
         1   2   1
       1   3   3   1
     1   4   6   4   1
*/

// 请在Begin-End间编写代码 注意：最后一行第一个数到行首的距离为 %2s 的距离，其余行往上依次加 %2s 的距离。
/********** Begin **********/
// 导入 Scanner 类
import java.util.Scanner;
// 定义公开类 Test
public class Test {
// 定义主方法 main，在该方法中完成本关任务
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int [][]arr = new int[n][n];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j <= i; j++) {
            if(j == 0 || j == i)
                arr[i][j] = 1;
            else
                arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
        }
    }
    for (int i = 0; i < n; i++) {
        System.out.printf("%"+(n-i)*2+"s","");
        for (int j = 0; j <= i; j++) {
            System.out.printf("%4d",arr[i][j]);
        }
        System.out.println();
    }
}
}


/********** End **********/



