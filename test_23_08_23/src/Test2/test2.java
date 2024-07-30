package Test2;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/8/23 0:46
 */
public class test2 {
    public static void main(String[] args) {
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int num = 148;
        System.out.println(binarySearch(arr, num));
    }

    public static int binarySearch(int[] arr, int num) {
        int min = 0;
        int max = arr.length - 1;
        int mid;
        while (true) {
            mid = (max + min) / 2;
            if (min > max) {
                return -1;
            } else if (arr[mid] > num) {
                max = mid - 1;
            } else if (arr[mid] < num) {
                min = mid + 1;
            } else if (arr[mid] == num) {
                return mid;
            }
        }
    }
}
