package step1;

import java.util.Objects;
import java.util.Scanner;

public class StudentOrTeacher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        Introduce p = null;
        if (Objects.equals(string, "学生")) {
            p = new Student();

        } else if (Objects.equals(string, "老师")) {
            p = new Teacher();

        }
        p.introduction();
    }
}

/********** Begin *********/
interface Introduce {
    void introduction();
}

class Student implements Introduce {
    @Override
    public void introduction() {
        System.out.println(" 我是一名学生！");
    }
}

class Teacher implements Introduce {
    @Override
    public void introduction() {
        System.out.println("我是一名老师！");
    }
}
/********** End *********/
