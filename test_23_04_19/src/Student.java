/*
 * 定义 Person 类和 Student 类，分别实现定义各自基本属性的功能。
 */

// 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码
/********* Begin *********/
// 声明一个名为Person的类，里面有name与age两个属性，分别为String和int型，并声明一个含有两个参数的构造方法
class Person{
    String name;
    int age;
    public Person(){

    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
// 声明一个名为Student的类，此类继承自Person类，添加一个属性school，字符串类型
public class Student extends Person{
    String school;
    public Student(String name, int age, String school){
        super(name, age);
        this.school = school;
    }
}
// 在子类的有参构造方法中调用父类中有两个参数的构造方法


/********** End **********/