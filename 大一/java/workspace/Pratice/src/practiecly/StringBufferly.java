package practiecly;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

public class StringBufferly {
    public static void main(String[] args) {
        String s ="abc.def.x@y";
        String[] split = s.split("\\.");//拆分字符串
        for(String temp : split){
            System.out.println(temp);
        }
        StringTokenizer stk = new StringTokenizer(s,".@");//拆分字符串，字符串's'遇见'.'和‘@’拆开
        while(stk.hasMoreElements()){
            String s1 = stk.nextToken();
            System.out.println(s1);
        }
        //Date date = new Date();
        //System.out.println(date);
        ///System.out.println(date.getTime());
//        Calendar calendar = new Calendar.getInstance();
//        get(Calendar.month);
//        Calendar.set(calendar.year,"2022");
//        System.out.println(Calendar.getTime());

    }
}
