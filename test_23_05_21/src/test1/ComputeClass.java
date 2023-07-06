package test1;



// 定义一个接口类 Compute
interface Compute{
// 第一个为 sum()，实现两个数的相加，返回值为 int
    int sum();
// 第二个为 max()，比较两个数的大小，携带两个参数，类型为int，返回值为int
    int max(int a, int b);
}

// 定义一个公开的 ComputeClass 类并实现 Compute 接口
public class ComputeClass {

// 有两个属性，分别表示两个数，类型为 int
    private int num1;
    private int num2;

// 有参构造方法

    public ComputeClass(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

// 实现接口中的求和方法
    int sum (){
        return this.num1+this.num2;
    }
// 实现接口中的获取较大数的方法
    int max(int num1,int num2){
        return Math.max(num1,num2);
    }
}
/********** End **********/