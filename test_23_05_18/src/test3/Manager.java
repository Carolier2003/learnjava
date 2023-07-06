package test3;

// 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码
/********** Begin **********/

// 定义员工抽象类 Employee，其中包含 2 个受保护的变量和两个抽象方法
abstract class Employee{
    // 两个受保护的变量：姓名 name（String），和工资 salary（double）；
    protected String name;
    protected double salary;
    //抽象方法 work，无返回值，表示工作内容
    abstract public void work();
    //抽象方法 info，无返回值，表示员工信息
    abstract public void info();
}
// 定义一个公开的经理类 Manager，该类继承员工类，除了有员工类的基本属性外，还有岗位级别 gender（String）私有属性。
public class Manager extends Employee{
    private String gender;
    // 定义一个有参构造方法
    public Manager(String name, double salary, String gender) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }
    // 重写 work() 方法，输出：“我负责对施工项目实施全过程、全面管理。”；
    @Override
    public void work(){
        System.out.println("我负责对施工项目实施全过程、全面管理。");
    }
    // 重写 info() 方法，输出：“姓名：xx，工资：xx，岗位级别：xx”。
    @Override
    public void info(){
        System.out.println("姓名：" + name + "，工资：" + salary + "，岗位级别：" + gender);
    }
}
/********** End **********/
