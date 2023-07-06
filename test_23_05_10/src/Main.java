/**
 * {@code @Author} ${USER}
 * {@code @create} ${DATE} ${TIME}
 */
class A {
    int m;
    int getM() {
        return m;
    }
    int seeM() {
        return m;
    }
}
class B extends A {
    int m ;
    int getM() {
        return m+100;
    }
}
public class Main {
    public static void main(String []args) {
        B b = new B();
        b.m = 20;
        //【代码1】
        System.out.println(b.getM());
        A a = b;
        // 上转型对象访问的是被隐藏的m
        a.m = -100;
        //【代码2】上转型对象调用的一定是子类重写的 // getM()方法
        System.out.println(a.getM());
        //【代码3】子类继承的seeM()方法操作的m是被 // 子类隐藏的m
        System.out.println(b.seeM());
    }
}