import java.awt.*;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(30);
        rectangle.setWidth(20);
        Triangle triangle = new Triangle();
        triangle.setHeight(10);
        triangle.setWidth(15);
        System.out.printf("矩形的面积：%.2f\n三角形的面积为%.2f",rectangle.area(),triangle.area());
    }
}
