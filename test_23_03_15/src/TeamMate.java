/*
任务：求出对战人信息。
输出样式：a的对手x
本关任务：两个乒乓球队进行比赛，各出 3 人。甲队为 a、b、c，乙队为 x、y、z。有人向队员打听比赛的名单，a 说他不是和 x 比，c 说他不是和 x、z 比。
*/

public class TeamMate {
    public static void main(String[] args) {


        // 请在Begin-End间编写代码
        /********** Begin **********/
        // 第一步：使用循环求出与c的对战的人
        for(char a = 'x';a <= 'z' ;a++){
            // 第二步：使用循环求出与a的对战的人
            for(char b = 'x';b<='z';b++){
                if(a == b) continue;
                // 第三步：使用循环求出与b对战的人
                for(char c ='x';c<='z';c++){
                    if(a==c||c==b) continue;
                    // 第三步：打印对战信息
                    if(c!='x' && c != 'z' && a != 'x'){
                        System.out.println("a的对手"+a);
                        System.out.println("b的对手"+b);
                        System.out.println("c的对手"+c);
                        break ;
                    }
                }
            }
        }
        /********** End **********/


    }
}
