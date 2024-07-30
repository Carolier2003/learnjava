package com.learn.test240716;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/7/16 14:23
 */
public class test1 {
    public static void main(String[] args) throws IOException {
        String familyNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        String familyStr = webCrawler(familyNet);
        String boyStr = webCrawler(boyNameNet);
        String girlStr = webCrawler(girlNameNet);

        ArrayList<String> familyStrTempList = getData(familyStr, "(?<![A-Za-z])((.{4})(，|。))", 2);
        ArrayList<String> boyNameStrTempList = getData(boyStr, "([\\u4E00-\\u9FA5]{2})(、|。)", 1);
        ArrayList<String> girlNameStrTempList = getData(girlStr, "(.. ){4}..", 0);

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

        BufferedWriter bw = new BufferedWriter(new FileWriter("CarolJava\\name.txt"));
        for (String name : names) {
            bw.write(name);
            bw.newLine();
        }
        bw.close();
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


    private static ArrayList<String> getData(String str, String regex, int index) {
        ArrayList<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            list.add(matcher.group(index));
        }
        return list;
    }

    private static String webCrawler(String net) throws IOException {
        StringBuilder sb = new StringBuilder();

        URL url = new URL(net);

        URLConnection conn = url.openConnection();

        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        int ch;
        while ((ch = isr.read()) != -1) {
            sb.append((char) ch);
        }
        isr.close();
        return sb.toString();
    }
}
