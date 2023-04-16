import java.util.Scanner;

/**
 * 任务：求解该方程的值。
 * 类名为：Equation
 */

public class Equation {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        double a = reader.nextDouble();
        double b = reader.nextDouble();
        double c = reader.nextDouble();

        // 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码
        /********** Begin **********/
        double d = b*b-4*a*c;
        double outcome1, outcome2;
        if(d>0){
            outcome1 = (-b+Math.sqrt(d))/(2*a);
            outcome2 = (-b-Math.sqrt(d))/(2*a);
            System.out.println("该方程有两个根");
            System.out.printf("x1 = %.2f，x2 = %.2f",outcome1,outcome2);
        } else if(d==0){
            outcome1=outcome2=-b/(2*a);
            System.out.println("该方程只有一个根");
            System.out.printf("x = %.2f",outcome1);
        } else{
            System.out.println("该方程无解");
        }
        // 第一步：判断方程有几个根

        // 第二步：如果方程有两个根，计算这两个值，将其按照题目所给的格式输出

        // 第三步：如果方程只有一个跟，计算出该值，将其按照题目所给的格式输出

        // 第四步：若方程无解，将其按照题目所给的格式输出


        /********** End **********/




    }
}
