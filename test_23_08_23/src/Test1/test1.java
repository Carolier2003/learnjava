package Test1;

import java.util.ArrayList;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/8/23 0:26
 */
public class test1 {
    public static void main(String[] args) {
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79, 81};
        int number = 81;
        System.out.println(search(arr, number));
    }

    public static ArrayList<Integer> search(int[] arr, int num) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                arrayList.add(i);
            }
        }
        return arrayList;
    }
}
