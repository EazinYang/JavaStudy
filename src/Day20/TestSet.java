package Day20;

import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

@SuppressWarnings("all")
public class TestSet {
    @Test
    public void test1(){
        HashSet set=new HashSet();
        set.add("张三");
        set.add("张三");
        set.add("李四");
        System.out.println(set);//[李四, 张三]
    }
    //顺序：HashSet无序
    @Test
    public void test2(){
        HashSet set=new HashSet();
        set.add("张三");
        set.add("王五");
        set.add("李四");
        set.add("陈九");
        System.out.println(set);//[李四, 张三, 王五, 陈九]
    }
    //顺序：LinkedHashSet添加顺序
    @Test
    public void test3(){
        LinkedHashSet set=new LinkedHashSet();
        set.add("张三");
        set.add("王五");
        set.add("李四");
        set.add("陈九");
        System.out.println(set);//[张三, 王五, 李四, 陈九]
    }
    //顺序：TreeSet大小顺序
    @Test
    public void test4(){
        TreeSet set=new TreeSet();
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("chailinyan");
        System.out.println(set);//[chailinyan, hello, java, world]
    }

}
