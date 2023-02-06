package Day18;

import TestInterface.D;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class TestDate {
    @Test
    public void test01(){
        Date d=new Date();
        System.out.println(d);//Wed Nov 30 10:58:49 CST 2022

        long time=System.currentTimeMillis();
        //当前系统时间距离1970-1.txt-1.txt 0:0:0:0毫秒的时间差
        System.out.println(time);//1669777263068
    }
    @Test
    public void test02(){
        Date d=new Date();
        long time=d.getTime();
        System.out.println(time);//1669778172028
    }
    @Test
    public void test03(){
        long time=1669778172028L;
        Date d=new Date(time);
        System.out.println(d);//Wed Nov 30 11:16:12 CST 2022
    }
    @Test
    public void test04(){
        Calendar c=Calendar.getInstance();
        System.out.println(c);
        //java.util.GregorianCalendar[time=1669779019165,
        // areFieldsSet=true,areAllFieldsSet=true,lenient=true,
        // zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",
        // offset=28800000,dstSavings=0,useDaylight=false,
        // transitions=29,lastRule=null],firstDayOfWeek=1.txt,
        // minimalDaysInFirstWeek=1.txt,ERA=1.txt,YEAR=2022,MONTH=10,
        // WEEK_OF_YEAR=49,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,
        // DAY_OF_YEAR=334,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,
        // AM_PM=0,HOUR=11,HOUR_OF_DAY=11,MINUTE=30,SECOND=19,
        // MILLISECOND=165,ZONE_OFFSET=28800000,DST_OFFSET=0]
        int year=c.get(Calendar.YEAR);
        System.out.println(year);//2022

        int month=c.get(Calendar.MONTH);
        System.out.println(month);//10
    }
    @Test
    public void test05(){
        String[] all=TimeZone.getAvailableIDs();
        System.out.println(Arrays.toString(all));//[Africa/Abidjan, Africa/Accra, ....]
        TimeZone t=TimeZone.getTimeZone("Hongkong");
        Calendar c=Calendar.getInstance(t);
        System.out.println(c);
    }
    @Test
    public void test06(){
        Date d=new Date();
        SimpleDateFormat s=new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒SSS毫秒 E");
        //把date日期转成字符串，按照指定的格式转
        String str=s.format(d);
        System.out.println(str);//2022年11月30日12时00分05秒365毫秒 周三
    }
    @Test
    public void test07() throws ParseException {
        String str="2022年11月30日12时00分05秒365毫秒 周三";
        SimpleDateFormat s=new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒SSS毫秒 E");
        Date d=s.parse(str);
        System.out.println(str);//2022年11月30日12时00分05秒365毫秒 周三
    }

    @Test
    public void test08(){
        LocalDate now=LocalDate.now();
        System.out.println(now);//2022-11-30
    }
    @Test
    public void test09(){
        LocalTime now=LocalTime.now();
        System.out.println(now);//15:05:58.213343200
    }
    @Test
    public void test10(){
        LocalDateTime now=LocalDateTime.now();
        System.out.println(now);//2022-11-30T15:08:29.196243800
    }
    @Test
    public void test11() {
        LocalDate lai=LocalDate.of(2019,5,13);
        System.out.println(lai);//2019-05-13
        System.out.println(lai.getDayOfYear());//133
    }
    @Test
    public void test12() {
        LocalDate lai=LocalDate.of(2019,5,13);
        LocalDate go=lai.plusDays(160);
        System.out.println(go);//2019-10-20
    }
    @Test
    public void test13() {
        LocalDate now=LocalDate.now();
        LocalDate beforce=now.minusDays(100);
        System.out.println(beforce);//2022-08-22
    }

    @Test
    public void test14() {
        LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy年MM月dd日HH时mm分ss秒 SSS毫秒 E 是这一年的D天");
        String str=df.format(now);
        System.out.println(str);//2022年11月30日15时28分09秒 554毫秒 周三 是这一年的334天
    }
    @Test
    public void test15() {
        LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter df=DateTimeFormatter.ISO_DATE_TIME;
        String str=df.format(now);
        System.out.println(str);//2022-11-30T15:29:23.890166
    }
    @Test
    public void test16() {
        LocalDateTime now=LocalDateTime.now();
//        DateTimeFormatter df=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        DateTimeFormatter df=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        String str=df.format(now);
        System.out.println(str);//2022/11/30 下午3:31
    }
}
