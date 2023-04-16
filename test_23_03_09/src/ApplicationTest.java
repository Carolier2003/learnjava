import java.util.Scanner;

/**
 * 任务：给定一个整数 a，判断其是否是自然数同时又是偶数。
 */
public class ApplicationTest {

    /**
     * 请在下面的 Begin - End 之间按照注释中给出的提示编写正确的代码
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 声明 int 类型的变量 a 用来获取控制台输入
        int a = scanner.nextInt();
        /********** Begin **********/
        // 第一步：判断变量 a 是否大于等于 0 ,如果符合条件，则进入第二步；反之，则在控制台输出"该数不是自然数"
        if(a>=0){
            if(a%2==0)
                System.out.println("该数既是自然数又是偶数");
            else
                System.out.println("该数为自然数，但不是偶数");
        }else
            System.out.println("该数不是自然数");
        // 第二步：判断变量 a 取模 2 是否为 0 ，如果为 0 ，则在控制台输出 "该数既是自然数又是偶数"；反之，则输出"该数为自然数，但不是偶数"



        /********** End **********/
    }
}


