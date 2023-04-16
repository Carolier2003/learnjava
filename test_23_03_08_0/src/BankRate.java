/**
 * 任务：假定一个用户每月向一个储蓄帐户中存 1000 元人民币，年利率为 2.25％。那么月利率为 0.0225/12=0.001875。
 * 编写一个程序，输出 6 个月后的账户金额。
 * 类名为：BankRate
 */

// 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码
/********** Begin **********/
// 第一步：创建一个名为 BankRate 的公开类
public class BankRate {

// 第二步：在这个类中定义主方法
public static void main(String[] args) {
    // 第三步：在主方法中计算第六个月后总资金为多少
    double interest = 0, rate = 0.001875, principal = 1000 ;
    for (int i = 0; i < 6; i++) {
        interest = rate*principal;
        principal += interest;
    }
    System.out.printf("%.2f",principal);
}
// 第四步：格式化输出六个月后账户的总金额，结果保留两位小数


}
/********** End **********/