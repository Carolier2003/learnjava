package test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * {@code @Author} 19667
 * {@code @create} 2023/8/16 0:06
 */
public class Time {
    public static void main(String[] args) throws ParseException {
        System.out.println(new Date());
        System.out.println(new Date(0L));
        Date d = new Date();
        long time = System.currentTimeMillis();
        d.setTime(time);
        System.out.println(d.getTime());
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat();
        System.out.println(simpleDateFormat1.format(d));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 EEEE");
        System.out.println(simpleDateFormat2.format(d));
        //解析
        String s = "1111年11月11日 11:11:11";
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(simpleDateFormat3.parse(s));
    }
}
