package test1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/8/20 0:28
 */
public class test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String strNum;
        while (true) {
            strNum = sc.nextLine();
            int num = Integer.parseInt(strNum);
            if (num > 100 || num < 1) {
                continue;
            }
            list.add(num);
            int sum = getSum(list);
            if (sum >= 200) {
                break;
            }
        }
    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }
}
