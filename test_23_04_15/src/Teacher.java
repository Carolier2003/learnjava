import java.util.Scanner;

//请在下面实现Teacher类的定义。
public class Teacher {
    public static void inputInfo(Student stu, Scanner sc){
        stu.setStudentNumber(sc.nextDouble());
        stu.setName(sc.next());
        stu.setUsualGrades(sc.nextDouble());
        stu.setExperimentalGrades(sc.nextDouble());
        stu.setFinalGrades(sc.nextDouble());
    }
}
