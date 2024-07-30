package com.carol.lambda;

import java.util.Arrays;
//import java.util.Comparator;

/**
 * {@code @Author} 19667
 * {@code @create} 2024/2/7 23:31
 */
public class lambdaGirlFriend {
    public static void main(String[] args) {
        girlFriend g1 = new girlFriend("cx", 19, 165);
        girlFriend g2 = new girlFriend("xk", 19, 169);
        girlFriend g3 = new girlFriend("jkl", 20, 170);
        girlFriend g4 = new girlFriend("abc", 20, 170);
        girlFriend[] arr = {g1, g2, g3, g4};
        /*Arrays.sort(arr, new Comparator<girlFriend>() {
            @Override
            public int compare(girlFriend o1, girlFriend o2) {
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getLength() - o2.getLength() : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
               if(temp < 0){
                   return -1;
               } else if (temp>0) {
                   return 1;
               }else{
                   return 0;
               }
            }
        });*/
        Arrays.sort(arr, (o1, o2)-> {
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getLength() - o2.getLength() : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
                if(temp < 0){
                    return -1;
                } else if (temp>0) {
                    return 1;
                }else{
                    return 0;
                }
            }
        );
        System.out.println(Arrays.toString(arr));
    }
}
