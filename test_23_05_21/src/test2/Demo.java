package test2;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/5/21 17:23
 */
public class Demo{
    public static void main(String[] args) {
        Person p=new Student();
        p.eat();
        p.sleep();
        p=new Teacher();
        p.eat();
        p.sleep();

    }
}