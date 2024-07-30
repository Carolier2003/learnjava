package com.learn.test240717;

import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.io.file.FileWriter;

import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/17 13:26
 */
public class test3 {
    public static void main(String[] args) {
        FileReader fr = new FileReader("C:\\Users\\19667\\IdeaProjects\\CarolJava\\CarolJava\\userinfo.txt");
        String info = fr.readString();
        int count = Integer.parseInt(info.split("=")[3]);
        String trueUsername = info.split("=")[1].split("&")[0];
        String truePassword = info.split("=")[2].split("&")[0];

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();

        if(trueUsername.equals(username)){
            if(count>=3){
                System.out.println("账户被锁定，无法登录，请联系管理员");
            } else if (truePassword.equals(password)) {
                System.out.println("登陆成功");
                FileWriter fw = new FileWriter("C:\\Users\\19667\\IdeaProjects\\CarolJava\\CarolJava\\userinfo.txt");
                fw.write("username="+trueUsername+"&password="+truePassword+"&count="+0);
            }else {
                System.out.println("登录失败,用户名或密码错误");
                count++;
                FileWriter fw = new FileWriter("C:\\Users\\19667\\IdeaProjects\\CarolJava\\CarolJava\\userinfo.txt");
                fw.write("username="+trueUsername+"&password="+truePassword+"&count="+count);
            }
        }else{
            System.out.println("登录失败,用户名或密码错误");
        }
    }
}
