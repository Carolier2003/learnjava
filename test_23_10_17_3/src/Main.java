import java.util.Scanner;

/**
 * @author 19667
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int floor = 0;
        int time = 0;
        int perUp = 6;
        int perDown = 4;
        int openTheDoll = 5;
        int arrive = 1;
        int[][] arr = new int[2][n];

        // 记录楼层和对应的乘客数
        for (int i = 0; i < n; i++) {
            int target = sc.nextInt();
            if (isExist(target, arr) != -1) {
                arr[1][isExist(target, arr)]++;
            } else {
                arr[0][i] = target;
                arr[1][i] = 1;
            }
        }

        // 使用快速排序对楼层和乘客数进行排序
        quickSort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            int target = arr[0][i];
            int people = arr[1][i];
            if (target == 0) {
                continue;
            } else if (target > floor) {
                time += (target - floor) * perUp + openTheDoll + arrive * people;
            } else {
                time += (floor - target) * perDown + openTheDoll + arrive * people;
            }
            floor = target;
        }

        time += floor * perDown;  // 返回到0层

        System.out.println(time);
    }

    private static int isExist(int target, int[][] arr) {
        for (int i = 0; i < arr[0].length; i++) {
            if (target == arr[0][i]) {
                return i;
            }
        }
        return -1;
    }

    private static void quickSort(int[][] arr, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(arr, left, right);
            quickSort(arr, left, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, right);
        }
    }

    private static int partition(int[][] arr, int left, int right) {
        int pivot = arr[0][right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[0][j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);

        return i + 1;
    }

    private static void swap(int[][] arr, int i, int j) {
        int temp = arr[0][i];
        arr[0][i] = arr[0][j];
        arr[0][j] = temp;

        temp = arr[1][i];
        arr[1][i] = arr[1][j];
        arr[1][j] = temp;
    }
}
