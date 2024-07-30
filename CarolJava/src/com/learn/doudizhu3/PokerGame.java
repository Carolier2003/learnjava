package com.learn.doudizhu3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/5/21 10:42
 */
public class PokerGame {
    static ArrayList<String> box = new ArrayList<>();
    static HashMap<String,Integer> hm = new HashMap<>();
    //准备牌
    static {
        String[] color = {"♠", "♦", "♥", "♣"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "J", "Q", "K", "A", "2"};
        for (String c : color) {
            for (String n : number) {
                box.add(c + n);
            }
        }
        box.add(" 小王");
        box.add(" 大王");

        hm.put("J",11);
        hm.put("Q",12);
        hm.put("K",13);
        hm.put("A",14);
        hm.put("2",15);
        hm.put("小王",114);
        hm.put("大王",514);
    }

    public PokerGame() {
        //洗牌
        Collections.shuffle(box);
        //抓牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        for (int i = 0; i < box.size(); i++) {
            String poker = box.get(i);
            if (i < 3) {
                lord.add(poker);
                continue;
            }
            if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            } else {
                player3.add(poker);
            }
        }
        //码牌
        order(lord);
        order(player1);
        order(player2);
        order(player3);
        //看牌
        lookPoker("地主",lord);
        lookPoker("jjl",player1);
        lookPoker("ljh",player2);
        lookPoker("cz",player3);

    }

    public void order(ArrayList<String> poker){
        Collections.sort(poker, new Comparator<String>() {
            @Override
            //o1要插入的数值
            public int compare(String o1, String o2) {
                String color1 = o1.substring(0,1);
                int value1 = getValue(o1);
                String color2 = o2.substring(0,1);
                int value2 = getValue(o2);
                int i = value1 - value2;
                return i == 0 ? color1.compareTo(color2) : i;
            }
        });
    }

    public int getValue(String poker){
        String number = poker.substring(1);
        if(hm.containsKey(number)){
            return hm.get(number);
        }else{
            return Integer.parseInt(number);
        }
    }

    public void lookPoker(String name, ArrayList<String> list) {
        System.out.print(name+":");
        for (String poker : list) {
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}