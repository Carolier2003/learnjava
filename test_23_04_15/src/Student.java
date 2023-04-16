//请在下面给出Student类的定义。
public class Student {
    private double studentNumber;
    private String name;
    private double usualGrades;
    private double experimentalGrades;
    private double finalGrades;
    private double totalGrades;

    char level;

    public void setStudentNumber(double studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsualGrades(double usualGrades) {
        this.usualGrades = usualGrades;
    }

    public void setExperimentalGrades(double experimentalGrades) {
        this.experimentalGrades = experimentalGrades;
    }

    public void setFinalGrades(double finalGrades) {
        this.finalGrades = finalGrades;
    }

    public void updateGrade() {
        this.totalGrades = this.usualGrades * 0.3 + this.experimentalGrades * 0.3 + this.finalGrades * 0.4;
        int grade = (int) this.totalGrades;
        switch (grade / 10) {
            case 10:
            case 9:
                this.level = 'A';
                break;
            case 8:
                this.level = 'B';
                break;
            case 7:
                this.level = 'C';
                break;
            case 6:
                this.level = 'D';
                break;
            default:
                this.level = 'E';
                break;
        }
    }

    public void outputInfo() {
        System.out.printf("学号=姓名=平时成绩=实验成绩=期末考试=%s(%.0f)的课程\"Java面向对象程序设计\"的成绩评定如下:\n", this.name, this.studentNumber);
        System.out.printf("平时成绩:%.2f\n",this.usualGrades);
        System.out.printf("实验成绩:%.2f\n",this.experimentalGrades);
        System.out.printf("期末考试:%.2f\n",this.finalGrades);
        System.out.printf("总评:%.2f,等级:%c",this.totalGrades,this.level);
    }
}