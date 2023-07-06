package test1;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/5/21 17:10
 */
public class Demo{
    public static void main(String[] args) {
        ComputeClass calc = new ComputeClass(100, 300);
        System.out.println("100 和 300 相加结果是：" + calc.sum());
        System.out.println("100 比较 300，哪个大：" + calc.max(100, 300));
    }
}