/**
 * {@code @Author} 19667
 * {@code @create} 2024/2/12 10:08
 */
import java.util.HashMap;

public class User {
    // Map<username, password>
    private final HashMap<String, String> users;
    public User() {
        users = new HashMap<>();
    }

    // 添加用户
    public void addUser(String username, String password) {
        users.put(username, password);
    }

    // 验证用户登录
    public boolean validateUser(String username, String password) {
        if (users.containsKey(username)) {
            return users.get(username).equals(password);
        }
        return false;
    }
}
