import java.util.Scanner;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/10/9 19:17
 * @author 19667
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char []arr = str.toCharArray();
        int boy = 0;
        int girl = 0;
        for (int i = 0; i < str.length()-2; i++) {
            if (arr[i]=='b'||arr[i+1]=='o'||arr[i+2]=='y') {
                boy++;
            }
        }
        for (int i = 0; i < str.length()-3; i++) {
            if (arr[i]=='g'||arr[i+1]=='i'||arr[i+2]=='r'||arr[i+3]=='l'){
                girl++;
            }
        }
        System.out.println(boy);
        System.out.println(girl);
    }
}
