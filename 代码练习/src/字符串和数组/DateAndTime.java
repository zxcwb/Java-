package 字符串和数组;

import java.util.Date;

public class DateAndTime {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        String time = String.format("%tc",date);
        String form = String.format("%tF",date);
        System.out.println("全部的时间信息是："+time);
        System.out.println("年-月-日格式："+form);
    }
}
