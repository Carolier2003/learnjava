/**
 * 任务：使用重载方法为 Student 类创建三个构造方法。
 * 类名为：Student
 */

public class Student0 {
    private String name;  // 学生的姓名
    private String num;  // 学生的学号信息
    private double grades;  // 学生的成绩
    // 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码
    /********** Begin **********/
    // 创建一个有参构造函数，携带一个学生姓名的参数
    public Student0(String name){
        setName(name);
    }
    // 创建一个有参构造函数，携带学生姓名和学生学号信息的参数
    public Student0(String name, String num){
        setName(name);
        setNum(num);
    }
    // 创建一个有参构造函数，携带学生姓名、学生学号和学生成绩信息的参数
    public Student0(String name, String num, double grades){
        setName(name);
        setNum(num);
        setGrades(grades);
    }
    /********** End **********/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public double getGrades() {
        return grades;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", num='" + num + '\'' +
                ", grades=" + grades +
                '}';
    }

}