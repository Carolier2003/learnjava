import java.util.Scanner;

public class Biorhythms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int e = sc.nextInt();
        int i = sc.nextInt();
        int d = sc.nextInt();
        int count = 1;
        while(!(p==i&&i==e&&e==d&&d==-1)){
            for (int j = d; j <= 21252; j++) {
                if((j-p)%23==0&&(j-p!=0))
                    if((j-e)%28==0&&(j-e!=0))
                        if((j-i)%33==0&&(j-i!=0)){
                            System.out.println("Case "+count+": the next triple peak occurs in "+(j-d)+" days.");
                            count++;
                        }

            }
            p = sc.nextInt();
            e = sc.nextInt();
            i = sc.nextInt();
            d = sc.nextInt();
        }
    }
}
