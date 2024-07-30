import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/8/10 15:59
 */
public class Main {
    public static void main(String[] args) {
        String str = "Java8helloJava114514";
        Pattern p = Pattern.compile("Java\\d{0,2}");
        Matcher m = p.matcher(str);

        while(m.find()){
            String s = m.group();
            System.out.println(s);
        }
        System.out.println("Hello world!");
    }
}