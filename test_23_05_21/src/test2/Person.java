package test2;

/**
 * 编写一个学校接待方面的程序，招待不同身份的人的食宿问题
 */

// 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码
/********** Begin **********/



// 定义一个接口类 Person
interface Person {
    void eat();
    void sleep();
}

// 定义一个 Student 类并实现 Person 接口
class Student implements Person {
    @Override
    public void eat() {
        System.out.println("学生去食堂吃饭。");
    }

    @Override
    public void sleep() {
        System.out.println("学生在宿舍睡觉。");
    }
}

// 定义一个 Teacher 类并实现 Person 接口
class Teacher implements Person {
    @Override
    public void eat() {
        System.out.println("老师去教师食堂吃饭。");
    }

    @Override
    public void sleep() {
        System.out.println("老师在学校公寓睡觉。");
    }
}



/********** End **********/
