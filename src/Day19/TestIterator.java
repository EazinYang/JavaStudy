package Day19;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {
    @SuppressWarnings("all")
    @Test
    public void test1(){
        Collection c=new ArrayList();
        c.add("张三");
        c.add("李四");
        c.add("王五");
        //返回这个集合自带的迭代器对象
        //让迭代器对象挨个访问元素
        Iterator iterator=c.iterator();
        while(iterator.hasNext()){
            Object obj=iterator.next();
            System.out.println(obj);
        }
    }

    @SuppressWarnings("all")
    @Test
    public void test2(){
        Collection c=new ArrayList();
        c.add("张三");
        c.add("李四");
        c.add("王五");
        //返回这个集合自带的迭代器对象
        //让迭代器对象挨个访问元素
        Iterator iterator=c.iterator();
        while(iterator.hasNext()){
            String obj=(String) iterator.next();
            //删除姓王
            if(obj.startsWith("王")){
                iterator.remove();
            }
            System.out.println(obj);
        }
    }

    @SuppressWarnings("all")
    @Test
    public void test3(){
        Collection c=new ArrayList();
        c.add("张三");
        c.add("李四");
        c.add("王五");

        //Object：元素的数据类型
        //obj：临时的元素名称
        //c：遍历的集合的名称
        for(Object obj:c){
            System.out.println(obj);
        }
    }
}
