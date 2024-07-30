package test8;


import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/4/6 21:22
 * 题目描述
 * M#复制Markdown:]展开
 * Perket 是一种流行的美食。为了做好 Perket，厨师必须谨慎选择食材，以在保持传统风,味的同时尽可能获得最全面的味道。你有”种可支配的配料。对于每一种配料，我们知道它们各自的酸度s和苦度 b。当我们添加配料时，总的酸度为每一种配料的酸度总乘积;总的苦度为每一种配料的苦度的总和。
 * 众所周知，美食应该做到口感适中，所以我们希望选取配料，以使得酸度和苦度的绝对差最小。
 * 另外，我们必须添加至少一种配料，因为没有任何食物以水为配料的。
 * 输入格式
 * 第一行一个整数 n，表示可供选用的食材种类数。
 * 接下来几 行，每行2 个整数 &;和b，表示第讠种食材的酸度和苦度。
 * 输出格式
 * 一行一个整数，表示可能的总酸度和总苦度的最小绝对差。
 */
public class Main {
    static int[][] arr = new int[11][3];
    static boolean[] st = new boolean[11];
    static int n;
    static int minAbs = 2000000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }
        sc.close();
        dfs(1);
        System.out.println(minAbs);
    }

    public static void dfs(int x) {
        if (x > n) {
            int acidity = 0;
            int spiciness = 0;
            boolean flag = false;
            for (int i = 1; i <= n; i++) {
                if (st[i]) {
                    flag = true;
                    if(acidity==0){
                        acidity+=arr[i][1];
                    }else{
                        acidity *= arr[i][1];
                    }
                    spiciness += arr[i][2];
                }
            }
            if(!flag){
                return;
            }

            int abs = Math.abs(acidity - spiciness);
            if (abs < minAbs) {
                minAbs = abs;
            }
            return;
        }
        st[x] = true;
        dfs(x + 1);
        st[x] = false;
        dfs(x + 1);
    }
}
