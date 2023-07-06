package Strinng;

import java.util.StringJoiner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/5/15 23:57
 *
 */
public class stringdemo1 {
    public static void main(String[] args) {
        System.out.println(new StringBuilder().append(123).append(456).append(789));
        System.out.println(new StringJoiner(
                "\n", "[", "]").add("123").add("456").add("789"));

    }
}
