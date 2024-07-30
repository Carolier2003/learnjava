package test2;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/8/20 0:42
 */
public class test2 {
    public static void main(String[] args) {
        String s = "123456789";
        int num = 0;
        if (s.matches("[1-9]\\d*")) {
            for (int i = 0; i < s.length(); i++) {
                int c = s.charAt(i) - 48;
                num = num * 10 + c;
            }
        }
        System.out.println(num);
        System.out.println(num+1);
    }
}
