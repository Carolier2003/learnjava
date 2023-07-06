package com.carol;

        import java.util.Scanner;

public class tentotwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binary = Integer.toBinaryString(n);
        System.out.println(binary);
    }
}
