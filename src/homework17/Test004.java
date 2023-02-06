package homework17;

import org.junit.Test;

import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

public class Test004 {
    @Test
    public void test04(){
//        String[] all={"柴林燕","张三","李四","崔志恒"};
//        Arrays.sort(all);
//        //按照自然顺序，按每一个字符的Unicode编码值排序
//        System.out.println(Arrays.toString(all));//[崔志恒, 张三, 李四, 柴林燕]
//
//        Arrays.sort(all, Collator.getInstance());//默认语言环境，因为我现在的操作系统的平台是中文win
//        //按照拼音顺序，字典顺序
//        System.out.println(Arrays.toString(all));//[[柴林燕, 崔志恒, 李四, 张三]]
//
//        Arrays.sort(all, Collator.getInstance(Locale.CHINA));//指定语言环境
//        String str=new String("hello");//两个对象
//        //一个在常量池中，hello
//        //一个在堆中，String的对象
//        //堆中的这个字符串对象char[]的value数组指向常量池中"hello"的char[]的value
//
//        String s1="hello";//修改为final String s1;s1变为了常量
//        String s2="world";
//        String s3="hellloworld";
//        String s4=s1+"world";//s1是变量，"world"是常量，变量+常量的结果在堆中
//        String s5=s1+s2;//s1和s2都是变量，变量+变量的结果在堆中
//        String s6="hello"+"helloworld";//常量+常量结果在常量池中，因为编译期间就可以确定结果
//        System.out.println(s3==s4);//false
//        System.out.println(s3==s5);//false
//        System.out.println(s3==s6);//ture
//
//        String s7=(s1+"world").intern();
//        String s8=(s1+s2).intern();//把拼接的结果放到常量池中
//        System.out.println(s3==s7);//true
//        System.out.println(s3==s8);//true
//        String s1;//局部变量未初始化
//        String s2=null;//初始化null
//        String s3="";//空字符串常量对象
//        String s4=new String();//空字符串对象
//        String s5=new String("");//两个对象，一个是常量池中的空字符串，一个是堆中
//        String s1="hello";
//        String s2="world";
//        String s3=s1+s2;
//        String s4=s1.concat(s2);
        String str="Hello";

    }
    //判断str是否是空字符串，是就返回true，不是返回false
    public boolean test01(String str){
        if("".equals(str)){//推荐写法
            return true;
        }
        return false;
    }
    public boolean test02(String str){
        if(str !=null && str.equals("")){
            return true;
        }
        return false;
    }
    public boolean test03(String str){
        if(str !=null && str.length()==0){
            return true;
        }
        return false;
    }
    public boolean test04(String str){
        if(str!=null && str.isEmpty()){
            return true;
        }
        return false;
    }
}
