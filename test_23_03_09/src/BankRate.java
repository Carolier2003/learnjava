public class BankRate {
    public static void main(String[] args) {
        double sum = 0;
        double rate = 0.001875;
        for (int i = 0; i < 6; i++) {
            sum = 10000;
            //
            sum = sum*(1+rate);
        }
        System.out.printf("%.2f",sum);
    }

}
