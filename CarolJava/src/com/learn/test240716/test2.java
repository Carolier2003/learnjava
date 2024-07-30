package com.learn.test240716;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/16 21:08
 */
public class test2 {
    public static void main(String[] args) {
        String familyNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        String familyNameStr = HttpUtil.get(familyNet);
        String boyNameStr = HttpUtil.get(boyNameNet);
        String girlNameStr = HttpUtil.get(girlNameNet);

        /*ArrayList<String> familyStrTempList = getData(familyStr, "(?<![A-Za-z])((.{4})(，|。))", 2);
        ArrayList<String> boyNameStrTempList = getData(boyStr, "([\\u4E00-\\u9FA5]{2})(、|。)", 1);
        ArrayList<String> girlNameStrTempList = getData(girlStr, "(.. ){4}..", 0);*/

        List<String> familyStrTempList = ReUtil.findAll("(?<![A-Za-z])((.{4})(，|。))", familyNameStr, 2);
        List<String> boyNameStrTempList = ReUtil.findAll("([\\u4E00-\\u9FA5]{2})(、|。)", boyNameStr, 1);
        List<String> girlNameStrTempList = ReUtil.findAll("(.. ){4}..", girlNameStr, 0);

        ArrayList<String> familyStrList = new ArrayList<>();
        for (String s : familyStrTempList) {
            for (int i = 0; i < s.length(); i++) {
                familyStrList.add(s.charAt(i) + "");
            }
        }

        ArrayList<String> boyNameStrList = new ArrayList<>();
        for (String s : boyNameStrTempList) {
            if (!boyNameStrList.contains(s)) {
                boyNameStrList.add(s);
            }
        }

        ArrayList<String> girlNameStrList = new ArrayList<>();
        for (String s : girlNameStrTempList) {
            Collections.addAll(girlNameStrList, s.split(" "));
        }

        ArrayList<String> names = getName(familyStrList, boyNameStrList, girlNameStrList, 50, 50);
        Collections.shuffle(names);

        FileUtil.writeLines(names,"CarolJava\\names.txt","UTF-8");
    }

    private static ArrayList<String> getName(ArrayList<String> familyStrList, ArrayList<String> boyNameStrList, ArrayList<String> girlNameStrList, int boyCount, int girlCount) {
        ArrayList<String> boys = new ArrayList<>();
        while(boys.size()<boyCount){
            Collections.shuffle(familyStrList);
            Collections.shuffle(boyNameStrList);
            boys.add(familyStrList.getFirst()+boyNameStrList.getFirst());
        }
        ArrayList<String> girls = new ArrayList<>();
        while(girls.size()<girlCount){
            Collections.shuffle(familyStrList);
            Collections.shuffle(girlNameStrList);
            girls.add(familyStrList.getFirst()+girlNameStrList.getFirst());
        }

        ArrayList<String> names = new ArrayList<>();
        Random r = new Random();
        for (String boy : boys) {
            int age = r.nextInt(8)+18;
            names.add(boy+"-男-"+age);
        }
        for (String girl : girls) {
            int age = r.nextInt(6)+18;
            names.add(girl+"-女-"+age);
        }
        return names;
    }
}
