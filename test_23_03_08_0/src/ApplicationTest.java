import java.util.Scanner;

/**
 * 任务：给出一个 GPA 成绩，输出与之对应的百分制成绩区间。
 */
public class ApplicationTest {

    /**
     * 请在下面的 Begin - End 之间按照注释中给出的提示编写正确的代码
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 声明 char 类型的变量 score 用来获取控制台输入的成绩
        char score = scanner.next().charAt(0);
        /********** Begin **********/
        /**
         * 使用 switch 构建 A 、B、C、D、E 五条分支
         *      分支 A ，控制台输出 “百分制分数段为90分以上”
         *      分支 B ，控制台输出 “百分制分数段为80-89分”
         *      分支 C ，控制台输出 “百分制分数段为70-79分”
         *      分支 D ，控制台输出 “百分制分数段为60-69分”
         *      分支 E ，控制台输出 “百分制分数段为60分以下”
         */
        switch(score){
            case 'A':
                System.out.println("百分制分数段为90分以上");break;
            case 'B':
                System.out.println("百分制分数段为80-89分");break;
            case 'C':
                System.out.println("百分制分数段为70-79分");break;
            case 'D':
                System.out.println("百分制分数段为60-69分");break;
            default:
                System.out.println("百分制分数段为60分以下");
        }



        /********** End **********/
    }
}


