import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/7/6 11:21
 */
public class UserSystem {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        loop:
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作1登录 2注册 3忘记密码");
            Scanner scanner = new Scanner(System.in);
            String choose = scanner.next();
            switch (choose) {
                case "1" -> logIn(list);
                case "2" -> register(list);
                case "3" -> resetPassword(list);
                default -> {
                    System.out.println("退出系统");
                    break loop;
                }
            }
        }
    }

    //登录
    public static void logIn(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String userName = sc.next();
        User user;
        user = lookUpUserName(list, userName);
        if (user != null) {
            //控制密码输入次数
            int n = 3;
            while (n > 0) {
                System.out.println("请输入密码");
                String password = sc.next();
                System.out.println("请输入验证码（不区分大小写）");
                String generateCaptcha = generateCaptcha();
                System.out.println(generateCaptcha);
                String captcha = sc.next();

                if (captcha.equalsIgnoreCase(generateCaptcha)) {
                    if (password.equals(user.getPassWord())) {
                        System.out.println("登录成功");
                        StudentSystem.main();
                        break;
                    } else {
                        n--;
                        if (n > 0)
                            System.out.println("密码错误，请重新输入，你还有" + n + "次机会");
                        else {
                            System.out.println("密码错误次数过多，强制返回主界面");
                        }
                    }
                } else {
                    System.out.println("验证码错误");
                }
            }
        } else {
            System.out.println("用户名未注册，请先注册");
        }
    }

    //注册用户
    public static void register(ArrayList<User> list) {
        System.out.println("注册");
        Scanner sc = new Scanner(System.in);
        // 定义正则表达式
        String patternString1 = "^(?!\\d+$)[A-Za-z\\d]{3,15}$";
        // 编译正则表达式
        Pattern pattern1 = Pattern.compile(patternString1);
        while (true) {
            System.out.println("请输入用户名");
            String username = sc.next();
            // 进行匹配
            if (pattern1.matcher(username).matches()) {
                while (true) {
                    System.out.println("请输入密码");
                    String password1 = sc.next();
                    System.out.println("请再次输入密码");
                    String password2 = sc.next();
                    if (password1.equals(password2)) {
                        //定义正则表达式
                        String patternString2 = "^[1-9]\\d{16}([0-9Xx])$";
                        //编译正则表达式
                        Pattern pattern2 = Pattern.compile(patternString2);
                        while (true) {
                            System.out.println("请输入身份证号码");
                            String identityCardId = sc.next();
                            //进行匹配
                            if (pattern2.matcher(identityCardId).matches()) {
                                System.out.println("请输入手机号");
                                //定义正则表达式
                                String patternString3 = "^[1-9]\\d{10}$";
                                //编译正则表达式
                                Pattern pattern3 = Pattern.compile(patternString3);
                                while (true) {
                                    String phoneNumber = sc.next();
                                    //进行匹配
                                    if (pattern3.matcher(phoneNumber).matches()) {
                                        User user = new User(username, password1, identityCardId, phoneNumber);
                                        list.add(user);
                                        System.out.println("注册成功");
                                        break;
                                    } else {
                                        System.out.println("错误的手机号，请重新输入");
                                    }
                                }
                                break;
                            } else {
                                System.out.println("错误的身份证号码，请重新输入");
                            }
                        }
                        break;
                    } else {
                        System.out.println("两次密码不一致，请重新输入");
                    }
                }
                break;
            } else {
                System.out.println("用户名无效");
            }
        }

    }

    //忘记密码
    public static void resetPassword(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想要重置密码的用户名");
        String userName = sc.next();
        User user = lookUpUserName(list,userName);
        if(user!=null){
            System.out.println("请输入身份证号码");
            String identityCardId = sc.next();
            System.out.println("请输入手机号码");
            String phoneNumber = sc.next();
            if(identityCardId.equals(user.getIdentityCardId())&&phoneNumber.equals(user.getPhoneNumber())){
                System.out.println("身份验证成功，请输入新密码");
                user.setPassWord(sc.next());
            } else {
                System.out.println("身份验证失败");
            }
        } else {
            System.out.println("用户名不存在");
        }
    }

    //查找用户名是否存在查找用户名
    public static User lookUpUserName(ArrayList<User> list, String username) {
        for (User user : list) {
            String name = user.getUseName();
            if (name.equals(username)) {
                return user;
            }
        }
        return null;
    }

    //生成验证码
    public static String generateCaptcha(){
        Random random = new Random();
        StringBuilder codeBuilder = new StringBuilder();

        // 生成一个随机数字
        int randomNumber = random.nextInt(10);

        // 生成四个随机字母
        for (int i = 0; i < 4; i++) {
            char randomChar = (char) (random.nextInt(26) + 'A'); // 大写字母
            if (random.nextBoolean()) {
                randomChar = Character.toLowerCase(randomChar); // 小写字母
            }
            codeBuilder.append(randomChar);
        }

        // 在任意位置插入随机数字
        int insertPosition = random.nextInt(5);
        codeBuilder.insert(insertPosition, randomNumber);

        //返回生成的验证码
        return codeBuilder.toString();
    }
}
