package Test1;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/8/22 1:08
 */
public class test1 {
    public static void main(String[] args) {
        System.out.println(toBinaryString(6));
        System.out.println(Integer.toBinaryString(6));
    }

    public static String toBinaryString(int num) {
        StringBuilder sb = new StringBuilder();
        while (num!=0) {
            sb.insert(0, num % 2);
            num = num / 2;
        }
        return sb.toString();
    }
}
