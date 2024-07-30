import java.util.Scanner;

/**
 * @author 19667
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double m = sc.nextDouble();
        if(n>m){
            System.out.println(">");
        }else if(n<m){
            System.out.println("<");
        }else{
            System.out.println("=");
        }
        sc.close();
    }
}
