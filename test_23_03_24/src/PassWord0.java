import java.util.Scanner; // 导入Scanner类，用于接收用户输入

public class PassWord0 { // 定义一个公共类PassWord
    public static void main(String[] args) { // 定义一个主方法，程序的入口
        // 请在Begin-End间编写完整代码
        /********** Begin **********/
        // 接收给定字符串
        Scanner sc = new Scanner(System.in); // 创建一个Scanner对象，用于接收用户输入
        String input = sc.nextLine(); // 调用nextLine()方法，读取一行字符串，并赋值给input变量
        // 将密文添加进字符数组
        String[] parts = input.split(" "); // 调用split()方法，以空格为分隔符，将input字符串分割成两个部分，并赋值给parts数组
        int offset = Integer.parseInt(parts[0]); // 将parts数组的第一个元素（偏移量）转换为整数，并赋值给offset变量
        char[] cipher = parts[1].toCharArray(); // 将parts数组的第二个元素（凯撒密码）转换为字符数组，并赋值给cipher变量
        // 破解密文
        char[] plain = new char[cipher.length]; // 创建一个和cipher数组长度相同的明文字符数组，并赋值给plain变量
        for (int i = 0; i < cipher.length; i++) { // 使用for循环，遍历cipher数组中的每个字符
            if (cipher[i] >= 'A' && cipher[i] <= 'Z') { // 如果是大写字母
                plain[i] = (char) (((cipher[i] - 'A' + offset) % 26 + 26) % 26 + 'A');
            } else if (cipher[i] >= 'a' && cipher[i] <= 'z') { // 如果是小写字母
                plain[i] = (char) (((cipher[i] - 'a' + offset) % 26 + 26) % 26 + 'a');
            } else { // 如果不是字母
                plain[i] = cipher[i]; // 保持不变，并赋值给plain数组的对应位置
            }
        }
        // 输出明文
        System.out.println(new String(plain)); // 将plain数组转换为字符串，并输出到控制台

        /********** End **********/
    }
}/*如果字符是大写字母，那么用它的ASCII码加上偏移量再取模26，然后加上65得到明文的ASCII码
如果字符是小写字母，那么用它的ASCII码加上偏移量再取模26，然后加上97得到明文的ASCII码*/