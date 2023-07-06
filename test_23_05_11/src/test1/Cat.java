package test1;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/5/11 20:30
 */
public class Cat extends Animal{
    @Override
    public void cry(){
        System.out.println("Meow");
    }
    @Override
    public String getAnimalName(){
        return "Cat";
    }
}
