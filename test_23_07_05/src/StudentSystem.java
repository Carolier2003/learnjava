import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * {@code @Author} ${USER}
 * {@code @create} ${DATE} ${TIME}
 */
public class StudentSystem {
    public static void main() {
        ArrayList<Student> list = new ArrayList<>();
        loop:
        while (true) {
            System.out.println("-------------欢迎来到黑马学生管理系统----------------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入您的选择:");
            Scanner scanner = new Scanner(System.in);
            String choose = scanner.next();
            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    break loop;
                }
                default -> System.out.println("没有这个选项");
            }
        }

    }

    //添加学生
    public static void addStudent(ArrayList<Student> list) {
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生id");
            String id = sc.next();
            if (judgementId(list, id)) {
                System.out.println("id重复，请重新输入");
            } else {
                stu.setId(id);
                break;
            }
        }
        System.out.println("请输入学生姓名");
        stu.setName(sc.next());
        System.out.println("请输入学生年龄");
        stu.setAge(sc.nextInt());
        System.out.println("请输入学生家庭住址");
        stu.setAddress(sc.next());
        list.add(stu);
        System.out.println("添加成功");
    }

    //删除学生
    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要删除的id");
        String id = sc.next();
        int index = index(list, id);
        if (index >= 0) {
            list.remove(index);
            System.out.println("id为"+id+"的学生删除成功");
        }  else{
            System.out.println("id不存在，删除失败");
        }
    }

    //修改学生
    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要修改的学生id");
        String id = sc.next();
        int index = index(list, id);
        if(index == -1){
            System.out.println("没有这个id,删除失败");
            return;
        }
        Student stu = list.get(index);
        System.out.println("请输入修改之后的学生id");
        stu.setId(sc.next());
        System.out.println("请输入修改之后的学生姓名");
        stu.setName(sc.next());
        System.out.println("请输入修改之后的学生年龄");
        stu.setAge(sc.nextInt());
        System.out.println("请输入修改之后的学生家庭住址");
        stu.setAddress(sc.next());
        System.out.println("修改成功");
    }

    //查询学生
    public static void queryStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }
        //打印表头
        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        for (Student stu : list) {
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }

    }

    //判断id是否重复
    public static boolean judgementId(ArrayList<Student> list, String id) {
        for (Student stu : list) {
            if (Objects.equals(stu.getId(), id)) {
                return true;
            }
        }
        return false;
    }

    //查找id对应下标
    public static int index(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String sid = stu.getId();
            if (sid.equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
