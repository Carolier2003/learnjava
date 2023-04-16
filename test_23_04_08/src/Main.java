import java.util.Scanner;
public class Main {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        int i,j,k;
        char c = input.next ().charAt (0);
        int n = input.nextInt ();
        if (n==1) {
            //特殊情况
            System.out.printf ("%c\n",c);
        } else {
            for (i=0;i<n-1;i++) {
                //输出第一行
                System.out.print (" ");
            }
            System.out.printf ("%c\n",c);
            for (i=0;i<n-1;i++) {//输出菱形上半部分·
                for (j=n-i-2;j>0;j--) {
                    System.out.print (" ");
                }
                if (c+i+1>90) {//判断是否超过了Z
                    System.out.printf ("%c",c+i+1-26);
                    for (k=0;k<i*2+1;k++) {//输出两个字母之间的空格。
                        System.out.print (" ");
                    }
                    System.out.printf ("%c\n",c+i+1-26);
                } else {
                    System.out.printf ("%c",c+i+1);
                    for (k=0;k<i*2+1;k++) {//输出两个字母之间的空格。
                        System.out.print (" ");
                    }
                    System.out.printf ("%c\n",c+i+1);
                }
            }
            for (i=0;i<n-2;i++) {
                for (j=0;j<i+1;j++) {
                    System.out.print (" ");
                }
                if (c+n-2-i>90) {
                    System.out.printf ("%c",c+n-2-i-26);
                    for (k=2*(n-i)-5;k>0;k--) {
                        System.out.print (" ");
                    }
                    System.out.printf ("%c\n",c+n-2-i-26);
                } else {
                    System.out.printf ("%c",c+n-i-2);
                    for (k=2*(n-i)-5;k>0;k--) {
                        System.out.print (" ");
                    }
                    System.out.printf ("%c\n",c+n-i-2);
                }
            }
            for (i=0;i<n-1;i++) {
                System.out.print (" ");
            }
            System.out.printf ("%c",c);
        }
    }
}