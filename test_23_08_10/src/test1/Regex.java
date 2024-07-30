package test1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/8/10 16:28
 */
public class Regex {
    public static void main(String[] args) {
        //来黑马程序员学习Java，手机号:18512516758，18512508907 "1[3-9]\\d{9}"
        //或者联系邮箱:boniu@itcast.cn， "\\w{1,}@\\w{1,}\\.\\w{1,}"
        //座机电话:01036517895，010-98951256邮箱:bozai@itcast.cn，"0\\d{2}-?\\d{8}"
        //热线电话:400-618-9090 ，400-618-4000，4006184000，4006189090 "4\\d{2}-?\\d{3}-?\\d{4}"
        String s = "来黑马程序员学习Java，手机号:18512516758，18512508907或者" +
                "联系邮箱:boniu@itcast.cn，" +
                "座机电话:01036517895，010-98951256" +
                "邮箱:bozai@itcast.cn，" +
                "热线电话:400-618-9090 ，400-618-4000，4006184000，4006189090";
        String regex = "(1[3-9]\\d{9})|(\\w+@(\\w+&&[^_])\\.\\w+)" +
                "|(0\\d{2}-?\\d{8})|(4\\d{2}-?\\d{3}-?\\d{4})";
        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher(s);

        while(m.find()){
            System.out.println(m.group());
        }
    }
}
