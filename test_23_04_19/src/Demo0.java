public class Demo0 {
    public static void main(String[] args) {
        NewWeight newWeight = new NewWeight(183);
        System.out.println("现在的标准体重为："+newWeight.weight());
        System.out.println("原来的标准体重为："+newWeight.getWeight());
    }
}