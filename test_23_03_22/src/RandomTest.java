import java.util.Random;
import java.util.Scanner;


public class RandomTest {
    public static void main(String[] args) {
        // 请在Begin-End间编写代码
        /********** Begin **********/
        // 接收给定数据
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long seed = input.nextLong();
        // 创建Random对象，并设置随机种子
        Random random = new Random(seed);
        // 定义数组添加数据
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(20);
        }
        // 统计每个数出现的次数
        for (int i = 0; i < 20; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(i == arr[j]){
                    count ++;
                }
            }
            if(count != 0)
                System.out.println(i+"出现了:"+count+" 次");
        }
        // 输出结果

        /********** End **********/

    }
}