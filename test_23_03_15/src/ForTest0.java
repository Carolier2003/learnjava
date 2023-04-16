/*
* 任务：使用for循环输出所有的水仙花数
*水仙花数特征：
  - 该值处于 100（包括）到 999（包括）之间；
  - 其个位数的三次幂，十位数的三次幂，百位数的三次幂的和等于这个数本身。
* 输出样式：x是一个水仙花数。
*/


public class ForTest0 {
    public static void main(String[] args) {

        // 请在 Begin-End 间编写代码

        /********** Begin **********/
        // 第一步：使用for循环依次取999到100中的每个数，判断是否为水仙花数
        for ( int i = 999; i >=100 ; i--) {

            // 第二步：获取个位
            int gewei = i%10;
            // 第三步：获取十位
            int shiwei = i/10%10;
            // 第四步：获取百位
            int baiwei = i/10/10%10;
            if(i==(Math.pow(gewei,3)+Math.pow(shiwei,3)+Math.pow(baiwei,3)))
                System.out.printf("%d是一个水仙花数。\n",i);
        }

        // 第五步：判断个位数的三次幂，十位数的三次幂，百位数的三次幂的和是否等于这个数本身，等于的话，输出该数

        /********** End **********/

    }
}