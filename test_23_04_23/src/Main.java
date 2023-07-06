import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        people[] a;
        double sum;
        while(in.hasNext()){
            n=in.nextInt();
            a=new people[n];
            sum=0;
            for(int i=0;i<n;i++) {
                a[i]=new people();
                a[i].time=in.nextInt();
                a[i].No=i+1;
            }
            sort(a);
            for(int i=0;i<n;i++) {
                sum=(n-i-1)*a[i].time+sum;
                if(i!=n-1)
                    System.out.print(a[i].No+" ");
            }
            System.out.println(a[n-1].No);
            System.out.printf("%.2f",sum/n);
            System.out.println();
        }
        in.close();
    }

    private static void sort(people[] a) {
        int t;
        for(int i=0;i<a.length;i++) {
            for(int j=a.length-1;j>i;j--) {
                if(a[j].time<a[j-1].time) {
                    t=a[j].time;
                    a[j].time=a[j-1].time;
                    a[j-1].time=t;
                    t=a[j].No;
                    a[j].No=a[j-1].No;
                    a[j-1].No=t;
                }
            }
        }

    }

}

class people{
    int time;
    int No;
}