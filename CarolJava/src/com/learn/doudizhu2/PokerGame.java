package com.learn.doudizhu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/5/21 13:04
 */
public class PokerGame {
    static HashMap<Integer, String> box = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();
    //准备牌
    static {
        String[] color = {"♠", "♦", "♥", "♣"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int serialNumber = 1;
        for (String n : number) {
            for (String c : color) {
                box.put(serialNumber, c + n);
                list.add(serialNumber);
                serialNumber++;
            }
        }
        box.put(serialNumber, "小王");
        list.add(serialNumber);
        serialNumber++;
        box.put(serialNumber, "大王");
        list.add(serialNumber);
    }

    public PokerGame() {
        //洗牌
        Collections.shuffle(list);
        //发牌 码牌
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            int serialNumber = list.get(i);
            if(i<3){
                lord.add(serialNumber);
                continue;
            }

            if(i%3 == 0){
                player1.add(serialNumber);
            } else if(i%3 == 1){
                player2.add(serialNumber);
            } else{
                player3.add(serialNumber);
            }
        }

        lookPoker("底牌",lord);
        lookPoker("ljh",player1);
        lookPoker("jjl",player2);
        lookPoker("cz",player3);
    }

    //看牌
    public void lookPoker(String name, TreeSet<Integer> ts) {
        System.out.print(name+":");
        for (Integer poker : ts) {
            System.out.print(box.get(poker)+" ");
        }
        System.out.println();
    }
}
