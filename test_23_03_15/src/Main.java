public class Main{
    public static void main(String[] args) {
        // your code
        long n = 8;
        long m = n;
        long sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += n;
            n = n *10 + m;
        }
        System.out.println(sum);
    }
}
// your code