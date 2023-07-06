package test3;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/5/13 11:17
 */
class E {
    int  x;
    long y = x;          //【1】
    public void f(int n) {
        int m = 0;          //【2】
        int p = 0;
        int t = n+m;      //【3】
        y = n+p;          //【4】
    }
}