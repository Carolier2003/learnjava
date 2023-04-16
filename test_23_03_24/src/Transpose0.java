public class Transpose0 {
    public static void main(String[] args) {
        // 请在Begin-End间编写代码
        /********** Begin **********/
        // 定义二维数组并初始化
        int [][]arr = new int[][]{{5,6,7},{15,65,43},{32,43,22},{11,88,6},{4,98,66}};
        // 定义转置后的新数组
        int [][]arr0 = new int[3][5];
        // 转置数组
        for (int i = 0; i < arr0.length; i++) {
            for (int j = 0; j < arr0[0].length; j++) {
                arr0 [i][j] = arr[j][i];
            }
        }
        // 打印新数组
        for (int i = 0; i < arr0.length; i++) {
            for (int j = 0; j < arr0[0].length; j++) {
                System.out.print(arr0[i][j]+" ");
            }
            System.out.println();
        }
        /********** End **********/
    }
}