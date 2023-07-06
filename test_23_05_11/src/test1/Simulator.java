package test1;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/5/11 20:13
 */
public class Simulator {
    public void playSound(Animal animal) {
        animal.cry();
        System.out.println(animal.getAnimalName());
    }
}
