/*
 * 任务：统计每人的总分。
 * 输出样式：x号学生的总分：y
 *
 * */

public class PassWord {
    public static void main(String[] args) {
        // 创建二维数组存储所有人的成绩
        int[][] arr = new int[][]{{90,88,87},{89,90,77},{66,78,60},{77,90,90},{89,78,67},{78,87,88}};

        // 请在 Begin-End 间编写代码
        /********** Begin **********/
        // 第一步：对每个人的各科成绩求和
        int arr1[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i][0] + arr[i][1] + arr[i][2];
        }
        // 第二步：输出每个人的总分数
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(i+"号学生的总分："+arr1[i]);
        }

        /********** End **********/

    }
}
