import java.util.Scanner;
public class Test0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三角形的三个边的长度：");
        double sideA = sc.nextDouble();
        double sideB = sc.nextDouble();
        double sideC = sc.nextDouble();

        Triangle t=new Triangle(sideA,sideB,sideC);
        System.out.printf("边长为(%.2f,%.2f,%.2f)的三角形面积为%.3f",t.getSideA(),t.getSideB(),t.getSideC(),t.getArea());
        sc.close();
    }

}