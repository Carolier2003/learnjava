
public class Test {
    public static void main(String[] args) {
        //求两个数的均值
        System.out.printf("%.2f\n",Test.getAve(2,3));
        //求三个数的均值
        System.out.printf("%.2f",Test.getAve(2,3,4));
    }
    //请在1、2处补充代码，不允许在其他地方修改或添加代码
    public static double getAve(int a, int b) {
        return (a+b)/2.0;
    }
    public static double getAve(int a, int b ,int c) {
        return (a+b+c)/3.0;
    }
}
