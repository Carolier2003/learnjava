package test1;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/5/11 20:46
 */
public class Application {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        simulator.playSound(new Dog());
        simulator.playSound(new Cat());
    }
}
