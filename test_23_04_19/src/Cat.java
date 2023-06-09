/**
 * 任务：重写 Cat 类中的 toString 方法，返回 Cat 类的基本信息。
 */
class Animal{
    private String name; // 动物名称
    private int age; // 动物年龄

    // 返回动物类的基本信息
    public String toString() {
        return "Anaimal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Cat extends Animal{
    private String name; // 小猫的名称
    private int age; // 小猫年龄

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码
    /********* Begin *********/
    // 重写 Anaimal 中的 toString 方法，返回类型为 String，格式：我是一只名为xx的小猫，今年xx岁了
    public String toString(){
        return "我是一只名为"+this.name+"的小猫，今年"+this.age+"岁了";
    }

    /********** End **********/
}
