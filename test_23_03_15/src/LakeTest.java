public class LakeTest {
    public static void main(String[] args) {
        int a, b, c, d;   // 定义4个人说的话
        int dongting, hongze, poyang, tai;  // 定义4个湖

        // 请在Begin-End间编写代码
        /********** Begin **********/
        // 使用嵌套循环依次遍历各个湖的4种排名情况，用逻辑表达式表达每人说的话，输出具体排名
        for (dongting = 1; dongting <= 4; dongting++) { // 洞庭湖可能的排名
            for (hongze = 1; hongze <= 4; hongze++) { // 洪泽湖可能的排名
                if (hongze == dongting) continue; // 排除相等的情况
                for (poyang = 1; poyang <= 4; poyang++) { // 鄱阳湖可能的排名
                    if (poyang == dongting || poyang == hongze) continue;
                    for (tai = 1; tai <= 4; tai++) { // 太湖可能的排名
                        if (tai == dongting || tai == hongze || tai == poyang) continue;
                        a = ((dongting == 1) ? 1 : 0) + ((hongze == 4) ? 1 : 0) + ((poyang == 3) ? 1 :0); // A说对了几句话
                        b = ((hongze == 1) ? 1 :0 ) + ((dongting == 4) ? 1 :0 ) + ((poyang ==2 ) ?1 :0 ) + ((tai==3)?1:0); // B说对了几句话 
                        c = ((hongze==4)?1:0)+((dongting==3)?1:0); // C说对了几句话 
                        d = ((poyang==1)?1:0)+((tai==4)?1:0)+((hongze==2)?1:0)+((dongting==3)?1:0); // D说对了几句话 
                        if(a==b && b==c && c==d && d==a && a==d && d==c&&a==1){   // 如果每人都只说对一句话
                            System.out.println("洞庭湖排名:"+dongting);
                            System.out.println("洪泽湖排名:"+hongze);
                            System.out.println("鄱阳湖排名:"+poyang);
                            System.out.println("太湖排名:"+tai);
                        }
                    }
                }
            }
        }

        /********** End **********/

    }
}