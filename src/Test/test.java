package Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
    public  static void main(String args[]) throws ParseException {
        String s="2018-06-18";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("转换前"+s);
          Date d=  df.parse(s);
        System.out.println("转换后"+d);
        String s1=df.format(d);
        System.out.println("转换成string"+s1);
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        String prefix = simpleDateFormat.format(date);
        System.out.println(prefix);

    }
}
