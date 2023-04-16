import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        // your code
        Scanner reader = new Scanner(System.in);
        int a = 0, b = 0, c = 0, d = 0;
        a = reader.nextInt();
        b = reader.nextInt();
        c = reader.nextInt();
        if(a<b)
        {
            if(c<a)
            {
                d=a;a=c;c=b;b=d;
            } else if (c<b)
            {
                d=b;b=c;c=d;
            }
        } else if (a>b) {
            d = a;
            a = b;
            b = d;
            if (c < a) {
                d = a;
                a = c;
                c = b;
                b = d;
            } else if (c < b) {
                d = b;
                b = c;
                c = d;
            }
        }
        System.out.println(a+" "+b+" "+c);
    }
 }
// your code