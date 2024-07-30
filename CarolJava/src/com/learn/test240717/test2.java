package com.learn.test240717;

import cn.hutool.core.io.file.FileReader;

import java.util.List;
import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/17 13:08
 */
public class test2 {
    public static void main(String[] args) {
        //数据已改
        FileReader fr = new FileReader("C:\\Users\\19667\\IdeaProjects\\CarolJava\\CarolJava\\userinfo.txt");
        String info = fr.readString();
        String trueUsername = info.split("=")[1].split("&")[0];
        String truePassword = info.split("=")[2];

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();

        if(trueUsername.equals(username)&&truePassword.equals(password)){
            System.out.println("登陆成功");
        }else{
            System.out.println("登录失败,用户名或密码错误");
        }

    }
}
