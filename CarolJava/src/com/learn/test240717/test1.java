package com.learn.test240717;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/17 10:04
 */
public class test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\19667\\IdeaProjects\\CarolJava\\CarolJava\\name.txt"));
        ArrayList<Student> names = new ArrayList<>();
        String name;
        double weights = 0;
        while ((name = br.readLine()) != null) {
            String[] data = name.split("-");
            names.add(new Student(data[0], data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3])));
            weights += Double.parseDouble(data[3]);
        }
        double[] weight = new double[names.size()];
        for (int i = 0; i < names.size(); i++) {
            weight[i] = names.get(i).getWeight() / weights;
        }

        double[] arr = new double[names.size()];
        arr[0] = weight[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = weight[i] + arr[i - 1];
        }

        int index = -Arrays.binarySearch(arr, Math.random()) - 1;
        System.out.println(names.get(index));
        names.get(index).setWeight(names.get(index).getWeight()/2.0);
        System.out.println(names.get(index));

        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\19667\\IdeaProjects\\CarolJava\\CarolJava\\name.txt"));
        for (Student student : names) {
            bw.write(student.toString());
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
