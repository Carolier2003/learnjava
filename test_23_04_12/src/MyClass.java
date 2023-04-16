public class MyClass {
    public int m1=2;

    public void showMemberInfo() {
        System.out.printf("m1=%d\n",m1);
    }
    //begin
    public MyClass(){
        System.out.printf("object constructing...\nconstructing finished!\n");
    }
    public MyClass(int a){
        this.m1=a;
    }
    //end
}