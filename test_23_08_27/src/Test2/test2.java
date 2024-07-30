package Test2;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/8/27 0:35
 */
public class test2 {
    //递归求和
    public static void main(String[] args) {
        System.out.println(haha(10000));
    }
    public static int haha(int number){
        if(number==1){
            return 1;
        }

        return number+haha(number-1);
    }
}
