public class GeTest {
    // 判断整数是否是素数
    public static boolean isPrime(int x){
        for(int y=2;y<x;y++){
            if(x%y==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // 验证 7-100 之间的数符合哥德巴赫猜想
        // 请在Begin-End间编写完整代码
        /********** Begin **********/
        int n; // 定义一个整型变量n，用来存储要验证的偶数
        for (n = 7; n <= 100; n += 1) { // 用一个for循环，让n从7开始递增到100，每次递增1
            int a, b; // 定义两个整型变量a和b，分别用来存储两个质数
            for (a = 2; a <= n / 2; a++) { // 用另一个for循环，让a从2开始递增到n/2，每次递增1
                b = n - a; // 计算b=n-a
                if (isPrime(a) && isPrime(b)) { // 判断a和b是否都是素数（可以调用isPrime方法）
                    System.out.println(n + "可分解为素数" + a + "和素数" + b); // 如果都是素数，则打印出n=a+b
                }
            }
        }
        /********** End **********/
    }
}