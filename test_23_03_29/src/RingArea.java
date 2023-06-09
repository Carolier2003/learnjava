/**
 * 任务：已知圆环的大圆半径 R 和 小圆半径 r 的长度分别为 32.0 和 10.0，求该圆环的面积和周长。
 * 类名为：RingArea
 */

public class RingArea {
    // 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码
    /********** Begin **********/

    // 定义三个量，两个变量分别为大圆半径和小圆半径，常量表示π，它的值可以调用 Math.PI获取，并将其设为静态常量。
    static double R;
    static double r;
    static final double pai = Math.PI;
    // 定义一个无参构造方法，将小圆半径设为 10.0，大圆半径设为32.0
    public  RingArea(){
        this.R = 32.0;
        this.r = 10.0;
    }

    /**
     * 定义一个静态方法，该方法实现计算圆环的周长，携带两个参数，分别为传来的小圆半径和大圆半径的值。
     * 将圆环周长的计算结果返回，返回类型为double
     */
    public static double circumference(double r,double R){
        return 2*RingArea.pai*(R+r);
    }
    /**
     * 定义一个静态方法，该方法实现计算圆环的面积，携带两个参数，分别为传来的小圆半径和大圆半径的值。
     * 将圆环面积的计算结果返回，返回类型为double
     */
    public static double area(double r,double R){
        return RingArea.pai*(R*R - r*r);
    }

    // 定义主方法
    public static void main(String[] args){

    // 在主方法中通过定义的无参构造方法定义一个对象
        RingArea ringArea = new RingArea();
    // 通过类名.方法名的方式调用计算圆环周长的方法，获取圆环周长，分别将该对象的小圆半径的值和大圆半径的值传入该方法中
        double C = RingArea.circumference(ringArea.r,ringArea.R);
    // 通过类名.方法名的方式调用计算圆环面积的方法，获取圆环面积，分别将该对象的小圆半径的值和大圆半径的值传入该方法中
        double S = RingArea.area(ringArea.r,ringArea.R);
    // 不换行四舍五入保留两位小数后格式化输出求出的值，输出格式：该圆环的周长为xx，面积为xx
        System.out.printf("该圆环的周长为%.2f，面积为%.2f",C,S);
    }
    /********** End **********/
}
