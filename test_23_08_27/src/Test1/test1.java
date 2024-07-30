package Test1;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/8/27 0:14
 */
public class test1 {
    public static void main(String[] args) {
        //插入排序
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        int startIndex = -1;
        //确定无序数组的起始索引
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                startIndex = i;
                break;
            }
        }
		//遍历无序数组
        for (int i = startIndex; i < arr.length; i++) {
            int j = i;
            //确定插入位置
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }

        for (int j : arr) {
            System.out.print(j);
            System.out.print(" ");
        }
    }
}
