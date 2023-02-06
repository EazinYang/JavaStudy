package Day19;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
    @SuppressWarnings("all")
    @Test
    public void test1(){
         /*
         我这里左边写Collection，目的是只关注Collection
         因为多态引用时，c编译期间只能访问Collection方法
          */
        Collection c=new ArrayList();//ArratList时Collection下面的一个实现类
        c.add("张三");
        c.add("李四");
        c.add("王五");
        System.out.println("获取有效元素的个数："+c.size());
    }

    @SuppressWarnings("all")
    @Test
    public void test2(){
        Collection c=new ArrayList();//ArratList时Collection下面的一个实现类
        c.add(1);
        c.add(2);
        c.add(3);
        Collection c2=new ArrayList();//ArratList时Collection下面的一个实现类
        c.add("张三");
        c.add("李四");
        c.add("王五");
        c.addAll(c2);//把c2的所有元素都添加到c集合中
//        c.add(c2);//添加是[xx,xx,xx]
        System.out.println("获取有效元素的个数："+c.size());
    }

    @SuppressWarnings("all")
    @Test
    public void test3(){
        Collection c=new ArrayList();//ArratList时Collection下面的一个实现类
        c.add("张三");
        c.add("李四");
        c.add("王五");
        System.out.println(c.contains("张三"));//ture
        System.out.println(c.contains("杨泓强"));
    }

    @SuppressWarnings("all")
    @Test
    public void test4(){
        Collection c=new ArrayList();//ArratList时Collection下面的一个实现类
        c.add("张三");
        c.add("李四");
        c.add("王五");
        Collection c2=new ArrayList();//ArratList时Collection下面的一个实现类
        c.add("张三");
        c.add("李四");
        System.out.println(c.containsAll(c2));//ture
    }

    @SuppressWarnings("all")
    @Test
    public void test5(){
        Collection c=new ArrayList();//ArratList时Collection下面的一个实现类
        c.add("张三");
        c.add("李四");
        c.add("王五");
        c.remove("张三");//删除一个
        System.out.println(c);//说明ArrayList重写了toString方法
    }

    @SuppressWarnings("all")
    @Test
    public void test6(){
        Collection c=new ArrayList();//ArratList时Collection下面的一个实现类
        c.add("张三");
        c.add("李四");
        c.add("王五");
        Collection c2=new ArrayList();//ArratList时Collection下面的一个实现类
        c.add("张三");
        c.add("李四");
        c.remove(c2);
        System.out.println(c);//王五
    }

    @SuppressWarnings("all")
    @Test
    public void test7(){
        Collection c=new ArrayList();//ArratList时Collection下面的一个实现类
        c.add("张三");
        c.add("李四");
        c.add("王五");
        Collection c2=new ArrayList();//ArratList时Collection下面的一个实现类
        c.add("张三");
        c.add("李四");
        c.retainAll(c2);
        System.out.println(c);//张三
    }

}
