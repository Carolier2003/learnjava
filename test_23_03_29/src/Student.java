
/**
 * 任务：定义一个 Student 学生公开类，该类具有学号 id(int)，年龄 age(int)，grade(int) 等属性；
 * 它们所具有的行为有学习 study()，考试 examination()，讲话 tell()，它们都无返回值和传入的参数。
 * 类名为：Student
 */
// 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码
/********** Begin **********/

// 第一步：创建一个名为 Student 的公开类
public class Student {


// 第二步：定义学生的属性
    int age,id,grade;
    public void study(){
        System.out.println("学号为"+id+"的学生正在学习。");
    }
    public void examination(){
        System.out.println(grade+"年级正在考试。");
    }
    public void tell(){
        System.out.println("正在讲话的是一个"+age+"岁的学生");
    }



// 第三步：定义学生的行为方法


/********** End **********/
}