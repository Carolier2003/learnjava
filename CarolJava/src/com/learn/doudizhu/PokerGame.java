package com.learn.doudizhu;

import java.util.ArrayList;
import java.util.Collections;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/5/21 10:42
 */
public class PokerGame {
    static ArrayList<String> box = new ArrayList<>();

    //准备牌
    static {
        String[] color = {"♠", "♦", "♥", "♣"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "J", "Q", "K", "A", "2"};
        for (String c : color) {
            for (String n : number) {
                box.add(c + n);
            }
        }
        box.add("小王");
        box.add("大王");

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
        //看牌
        lookPoker("地主",lord);
        lookPoker("jjl",player1);
        lookPoker("ljh",player2);
        lookPoker("cz",player3);
        //马牌
    }

    public void lookPoker(String name, ArrayList<String> list) {
        System.out.print(name+":");
        for (String poker : list) {
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
