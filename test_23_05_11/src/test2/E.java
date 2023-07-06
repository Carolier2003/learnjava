package test2;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/5/11 20:49
 */
class University {
    public int getScore(){
        return 410;
    }
}
class Beijing extends University {
    public int getScore(){
        return 210+super.getScore();
    }
}
class Shanghai extends University {
    public int getScore(){
        return 220+super.getScore();
    }
}
public class E {
    public static void main(String args[]){
        University u = new Beijing();
        int m = u.getScore();
        u = new Shanghai();
        int n = u.getScore();
        System.out.printf("%d:%d",m,n); //【代码】
    }
}