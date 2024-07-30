/**
 * {@code @Author} 19667
 * {@code @create} 2024/2/19 16:48
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    // 验证手机号的正则表达式
    private static final String PHONE_REGEX = "^1[3-9]\\d{9}$";
    private static final Pattern PHONE_PATTERN = Pattern.compile(PHONE_REGEX);

    // 验证手机号是否合法
    public static boolean isValidPhoneNumber(String phoneNumber) {
        Matcher matcher = PHONE_PATTERN.matcher(phoneNumber);
        return matcher.matches();
    }
}
