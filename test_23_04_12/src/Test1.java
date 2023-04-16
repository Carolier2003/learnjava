import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int a1=sc.nextInt();
        int b1=sc.nextInt();
        MyNumber numA=new MyNumber(a1);
        MyNumber numB=new MyNumber(b1);
        System.out.printf("a1=%d,b1=%d\n",numA.getNumber(),numB.getNumber());
        MyNumber.swap(numA,numB);
        System.out.printf("a1=%d,b1=%d", numA.getNumber(),numB.getNumber());
        sc.close();
    }

}
