package test7;

import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/4/6 19:22
 * 给你几 根火柴棍，你可以拼出多少个形如 A + B = C 的等式?等式中的 A、B、C 是用火柴棍拼出的整数(若该数非零，则最高位不能是 0)。用火柴棍拼数字0~ 9的拼法如图所示:
 * TT T
 * 注意:
 * 1.加号与等号各自需要两根火柴棍;
 * 2.如果A≠B,则A+B=C与B+A=℃ 视为不同的等式(A,B,C >0);
 * 3.n 根火柴棍必须全部用上。
 * 输入格式
 * 个整数 n(1 < n < 24)。
 * 输出格式
 * 个整数，能拼成的不同等式的数目。
 */
public class Main {
    static int maxN = 100;
    //表示火柴的数量
    static int n;
    //表示方案的总数
    static int ans;
    //存答案的数组
    static int[] arr = new int[maxN];
    //记录每个数字所需要的火柴的个数
    static int[] nums = new int[1001];
    static int[] st = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        n -= 4;
        sc.close();
        for (int i = 0; i <= 1000; i++) {
            if (i < 10) {
                nums[i] = st[i];
            } else {
                nums[i] = nums[i % 10] + nums[i / 10];
            }
        }
        dfs(1, 0);
        System.out.println(ans);
    }

    /**
     * @param x 表示枚举到了哪一个位置
     */
    public static void dfs(int x, int sum) {
        if (sum > n) {
            return;
        }
        if (x > 3) {
            if ((arr[1] + arr[2] == arr[3]) && sum == n) {
                ans++;
            }
            return;
        }
        for (int i = 0; i <= 1000; i++) {
            arr[x] = i;
            dfs(x + 1, sum + nums[i]);
            //恢复现场
            arr[x] = 0;
        }
    }

    public static int compute(int x) {
        if (x < 10) {
            return nums[x];
        } else {
            int temp = 0;
            while (x != 0) {
                temp += nums[x % 10];
                x /= 10;
            }
            return temp;
        }
    }
}
