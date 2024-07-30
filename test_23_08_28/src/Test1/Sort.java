package Test1;

import java.util.Random;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/8/28 0:38
 */
public class Sort {

    public static void main(String[] args) {
        //int[] arr = {1, 1, 6, 2, 7, 9, 3, 4, 5, 1, 10, 8};
        int[] arr = new int[1000000];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }
        //快速排序
        long start = System.currentTimeMillis();
        //quickSort(arr, 0, arr.length - 1);
        //mpSort(arr);
        //chooseSort(arr);
        insertSort(arr);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
//        for (int j : arr) {
//            System.out.print(j + " ");
//        }
    }

    public static void quickSort(int[] arr, int i, int j) {
        int start = i;
        int end = j;
        //递归出口
        if (start > end) {
            return;
        }
        //记录基准数
        while (start != end) {
            //确定end的位置
            while (arr[end] >= arr[i] && end > start) {
                end--;
            }

            //确定start的位置
            while (arr[start] <= arr[i] && end > start) {
                start++;
            }
            //交换end和start对应数据的位置
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
        }
        //基准数归位
        int temp = arr[end];
        arr[end] = arr[i];
        arr[i] = temp;
        quickSort(arr, i, start - 1);
        quickSort(arr, start + 1, j);
    }

    public static void mpSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void chooseSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void insertSort(int[] arr) {
        //1.找到无序的哪一组数组是从哪个索引开始的。  2
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[i + 1]){
                startIndex = i + 1;
                break;
            }
        }

        //2.遍历从startIndex开始到最后一个元素，依次得到无序的哪一组数据中的每一个元素
        for (int i = startIndex; i < arr.length; i++) {
            //问题：如何把遍历到的数据，插入到前面有序的这一组当中

            //记录当前要插入数据的索引
            int j = i;

            while(j > 0 && arr[j] < arr[j - 1]){
                //交换位置
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }

        }
    }
}
