/*
接收一个年份数（大于等于1900）和一个月份数，打印出该月的日历。
日历输出格式如下：
==================================================
日	一	二	三	四	五	六
						1
2	3	4	5	6	7	8
9	10	11	12	13	14	15
16	17	18	19	20	21	22
23	24	25	26	27	28	29
==================================================
其中日期上下的分隔符用的是50个=。
日期之间以及星期之间使用\t分隔。
1900年1月1日是星期1。


思路分析：
求1900年到输入年份之间的累计天数，其中闰年366天，平年365天；
求1月到输入月份之间的累计天数；
得到1900-1-1到输入年月之前所有天数，用总天数对7求余，对余数加1，该数值即为该月1号的星期；
判断输入月份有多少天；
控制格式打印日历。
日期之间以及星期之间使用 \t 分隔。
*/

// 请在Begin-End间编写完整代码，类名请使用Calendar
/********** Begin **********/

import java.util.Scanner;
// 导入 Scanner 类
import java.util.Scanner;
// 定义公开类 Calendar
public class Calendar {
// 定义主方法 main，在该方法中完成本关任务
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int year = imput.nextInt();
        int moon = imput.nextInt();
        int Leapyear = 0;//闰年
        int Commonyear = 0;//平年
        int Alldays = 0;
        if(year>=1900){
            if(moon<=12) {
                System.out.println("==================================================");
                System.out.printf("日\t一\t二\t三\t四\t五\t六\n");//输出表头
                for (int i = 1900; i < year; i++) {
                    if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)//闰年的判定
                        Leapyear++;
                    else
                        Commonyear++;

                }//for循环遍历年份
                Alldays = Leapyear * 366 + Commonyear * 365;
                switch (moon) {
                    case 2:
                        Alldays += 31;
                        break;
                    case 3:
                        Alldays += 59;
                        break;
                    case 4:
                        Alldays += 90;
                        break;
                    case 5:
                        Alldays += 120;
                        break;
                    case 6:
                        Alldays += 151;
                        break;
                    case 7:
                        Alldays += 181;
                        break;
                    case 8:
                        Alldays += 212;
                        break;
                    case 9:
                        Alldays += 243;
                        break;
                    case 10:
                        Alldays += 273;
                        break;
                    case 11:
                        Alldays += 304;
                        break;
                    case 12:
                        Alldays += 334;
                        break;

                }
                if(moon>2&&(year % 4 == 0 && year % 100 != 0 || year % 400 == 0))
                    Alldays++;
                Alldays ++;
                Alldays %= 7;
                int Control = 0;
                for (int i = 0; i < Alldays; i++) {
                    System.out.print("\t");
                    Control ++;
                }
                int Day = 0 ;
                switch (moon) {
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        Day = 31;break;
                    case 2:
                        Day = 28;break;
                    default:
                        Day = 30;
                }
                if(moon==2&&(year % 4 == 0 && year % 100 != 0 || year % 400 == 0))
                    Day ++;
                for (int i = 1; i <= Day; i++) {
                    System.out.printf("%d\t",i);
                    Control ++;
                    if(Control % 7 == 0)
                        System.out.printf("\n");
                }
                System.out.printf("\n==================================================");
            }else
                System.out.println("请输入正确的月份");
        }
        else
            System.out.println("请输入大于或等于1900的年份");
    }

}
/********** End **********/
