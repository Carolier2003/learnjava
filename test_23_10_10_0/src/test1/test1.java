package test1;

import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/10 13:28
 */

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bx, by, horseX, horseY;
        bx = sc.nextInt();
        by = sc.nextInt();
        horseX = sc.nextInt();
        horseY = sc.nextInt();
        long ways = track(bx, by, horseX, horseY);
        System.out.println(ways);
    }

    private static long track(int bx, int by, int horseX, int horseY) {
        long[][] dynamicPlan = new long[bx + 1][by + 1];
        dynamicPlan[0][0] = 1;
        //右上1
        if (horseY - 2 >= 0) {
            dynamicPlan[horseX + 1][horseY - 2] = -1;
        }
        //左上1
        if (horseY - 2 >= 0 && horseX - 1 >= 0) {
            dynamicPlan[horseX - 1][horseY - 2] = -1;
        }
        //右上2
        if (horseY - 1 >= 0) {
            dynamicPlan[horseX + 2][horseY - 1] = -1;
        }
        //左上2
        if (horseY - 1 >= 0 && horseX - 2 >= 0) {
            dynamicPlan[horseX - 2][horseY - 1] = -1;
        }
        //右下1
        if (horseY + 2 <= 20) {
            dynamicPlan[horseX + 1][horseY + 2] = -1;
        }
        //左下1
        if (horseY + 2 <= 20 && horseX - 1 >= 0) {
            dynamicPlan[horseX - 1][horseY + 2] = -1;
        }
        //右下2
        if (horseY + 1 <= 20) {
            dynamicPlan[horseX + 2][horseY + 1] = -1;
        }
        //左下2
        if (horseY + 1 <= 20 && horseX - 2 >= 0) {
            dynamicPlan[horseX - 2][horseY + 1] = -1;
        }
        //
        for (int i = 1; i <= bx; i++) {
            if (i == horseX && horseY == 0) {
                break;
            }
            if (dynamicPlan[i][0] != -1) {
                dynamicPlan[i][0] = dynamicPlan[i - 1][0];
            } else {
                dynamicPlan[i][0] = 0;
            }
        }
        for (int i = 1; i <= by; i++) {
            if (i == horseY && horseX == 0) {
                break;
            }
            if (dynamicPlan[0][i] != -1) {
                dynamicPlan[0][i] = dynamicPlan[0][i - 1];
            } else {
                dynamicPlan[0][i] = 0;
            }
        }
        for (int i = 1; i <= bx; i++) {
            for (int j = 1; j <= by; j++) {
                if ((i == horseX + 1 && j == horseY + 2) ||
                        (i == horseX + 2 && j == horseY + 1) ||
                        (i == horseX + 1 && j == horseY - 2) ||
                        (i == horseX + 2 && j == horseY - 1) ||
                        (i == horseX - 1 && j == horseY + 2) ||
                        (i == horseX - 2 && j == horseY + 1) ||
                        (i == horseX - 1 && j == horseY - 2) ||
                        (i == horseX - 2 && j == horseY - 1) ||
                        (i == horseX && j == horseY)) {
                    dynamicPlan[i][j] = 0;
                } else {
                    dynamicPlan[i][j] = dynamicPlan[i - 1][j] + dynamicPlan[i][j - 1];
                }
            }
        }
        return dynamicPlan[bx][by];
    }
}