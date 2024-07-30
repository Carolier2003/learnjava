package test1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] schoolHours = new int[7];
        int[] momHours = new int[7];

        for (int i = 0; i < 7; i++) {
            schoolHours[i] = scanner.nextInt();
            momHours[i] = scanner.nextInt();
        }

        int maxUnhappiness = 0;
        int unhappyDay = 0;

        for (int day = 0; day < 7; day++) {
            int totalHours = schoolHours[day] + momHours[day];

            if (totalHours > 8) {
                int unhappiness = totalHours - 8;
                if (unhappiness > maxUnhappiness) {
                    maxUnhappiness = unhappiness;
                    unhappyDay = day + 1;
                }
            }
        }

        System.out.println(unhappyDay);
    }
}
