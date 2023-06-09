/**
 * 重写 Shape 中的 area 方法，计算球的表面积。
 */

class Shape {
    private double r; //球的半径
    // 球的体积
    public double area(){
        double s = (double)3/4*Math.PI*Math.pow(r,3);
        return s;
    }
}
public class Sphere extends Shape {

    private double r; //球的半径

    public Sphere(double r) {
        this.r = r;
    }
    // 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码
    /********* Begin *********/
    // 重写 Shape 中的 area 方法，计算球的表面积，将计算结果返回
    public double area(){
        return 4*Math.PI*this.r*this.r;
    }
    /********** End **********/
}

