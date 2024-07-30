import java.io.IOException;
import java.math.BigInteger;
import java.util.Random;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/7/31 15:56
 */
public class Main {
    public static void main(String[] args) throws IOException {
       /* System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);
        System.out.println(Runtime.getRuntime().exec("shutdown -a"));*/
     /*   for (int i = 0; i < 100; i++) {
            BigInteger bg1 = new BigInteger(4, new Random());
            System.out.println(bg1);
        }*/
        BigInteger bg2 = new BigInteger("1145141919810");
        System.out.println(bg2);
		BigInteger bg3 = new BigInteger("1145141919810",16);
        System.out.println(bg3);
        BigInteger bg4 = BigInteger.valueOf(16);
        System.out.println(bg4);
    }
}