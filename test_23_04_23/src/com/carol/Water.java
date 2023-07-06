package com.carol;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Person{
    int time;
    int index;

    public Person(int time, int index) {
        this.time = time;
        this.index = index;
    }
}

public class Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            if(n==0){
                System.out.println(0);
                System.out.println(0);
            }else {
                Person[] arr = new Person[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = new Person(sc.nextInt(), i + 1);
                }
                Arrays.sort(arr, new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        if(o1.time != o2.time)
                            return o1.time - o2.time;
                        else
                            return o1.index - o2.index;
                    }
                });
                double time = 0;
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i].index);
                    if (i != n - 1)
                        System.out.print(" ");
                    for (int j = 0; j < i; j++) {
                        time += arr[j].time;
                    }
                }
                System.out.println();
                DecimalFormat df = new DecimalFormat("#.00");
                System.out.println(df.format(time / n));
            }
        }
    }
}
