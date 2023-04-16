import java.util.Scanner;

/**
 * 任务：根据键盘输入的三个 double 型的数字判断其是否能构成三角形。
 * 类名为：Triangle
 */

public class Triangle {

    // 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码
    /********** Begin **********/

    /**
     * 定义一个静态方法，该方法检验三边是否能构成三角形，携带三个参数，分别为传来的三个参数，无返回值
     * 如果能构成，不换行输出：这三条边可以构成三角形
     * 如果不能，不换行输出：这三条边不能构成三角形
     */
    public static void can(double a,double b,double c){
        double temp;
        if(a > b) {temp = a; a = b; b = temp ;}
        if(a > c) {temp = a; a = c; c = temp ;}
        if(b > c) {temp = b; b = c; c = temp ;}
        if((a+b) > c)
            System.out.println("这三条边可以构成三角形");
        else
            System.out.println("这三条边不能构成三角形");
    }



    // 定义主方法
    public static void main(String []arr){
    // 获取键盘输入的三个数
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
    // 通过类名.方法名的方式调用检验三边是否能构成三角形的方法，分别将键盘输入的三个数传入该方法中
        Triangle.can(x,y,z);
    /********** End **********/
    }
}
