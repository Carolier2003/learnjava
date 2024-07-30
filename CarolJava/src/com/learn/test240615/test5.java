package com.learn.test240615;

import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/6/15 19:05
 */
public class test5 {
    public static void main(String[] args) {
        GirlFriend mygirlfriend = new GirlFriend();
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("请输入姓名");
                String name = sc.nextLine();
                mygirlfriend.setName(name);
                System.out.println("请输入年龄");
                String strAge = sc.nextLine();
                int age = Integer.parseInt(strAge);
                mygirlfriend.setAge(age);
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (NameFormatException e){
                e.printStackTrace();
            } catch (AgeOutOfBoundsException e){
                e.printStackTrace();
            }
        }

        System.out.println(mygirlfriend);
    }
}
