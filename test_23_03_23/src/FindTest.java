
import java.util.Scanner;

public class FindTest {
    public static void main(String[] args) {

        // 请在 Begin-End 间编写代码
        /********** Begin **********/
        // 定义变量
        Scanner input = new Scanner(System.in);
        int n ,needToFind;
        // 接收给定数据
        n = input.nextInt();
        needToFind = input.nextInt();
        // 定义数组
        int arr[] = new int[n];
        // 给数组赋值
        for (int i = 0; input.hasNextInt(); i++) {
            arr[i] = input.nextInt();
        }
        // 查找给定元素索引，并输出查找次数
        int max = n - 1;
        int min = 0;
        int mid = (max + min)/2;
        int count = 0;
        while(true){
            count ++;
            if(needToFind < arr[mid]) {
                max = mid - 1;
            }
            else if(needToFind > arr[mid]) {
                min = mid + 1;
            }
            else{
                System.out.println("索引值："+mid+"。查找次数："+count+"。");
                break;
            }
            if(max<min) {
                System.out.println("没有找到");
                break;
            }
            mid = (max + min)/2;
        }
        /********** End **********/
    }
}

