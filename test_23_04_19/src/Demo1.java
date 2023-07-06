public class Demo1 {
    public static void main(String[] args) {
        Student0 s1 = new Student0("zhangsan");
        Student0 s2 = new Student0("lisi","0035");
        Student0 s3 = new Student0("wangwu","0056",82);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
    }
}