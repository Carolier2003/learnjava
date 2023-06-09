/**
 * 任务：定义一个 NewWeight 的公开类，并继承 OldWeight 类，在该类中实现计算身高的标准体重。
 */
class OldWeight {
    double height = 175;
    public double getWeight(){
        return height - 105;
    }
}
// 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码
/********** Begin **********/
// 定义一个NewWeight的公开类，并继承OldWeight类
class NewWeight extends OldWeight{
// 定义一个变量height，类型为double
    double height;
// 定义一个有参构造方法，携带身高参数
    public NewWeight(int height){
        this.height = height;
    }
// 定义一个方法名为weight的方法，返回类型为double，计算现在的标准体重并返回
    double weight(){
        return this.height - 105;
    }
}
/********** End **********/