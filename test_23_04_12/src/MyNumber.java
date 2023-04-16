public class MyNumber {
     private int number;
    public MyNumber(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
    public static void swap(MyNumber a, MyNumber b){
        int temp = a.number;
        a.number = b.number;
        b.number = temp;
    }
}
