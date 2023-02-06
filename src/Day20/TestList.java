package Day20;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@SuppressWarnings("all")
public class TestList {
    @Test
    public void test1(){
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
//        list.remove(1.txt);
//        System.out.println(list);//[1.txt, 3, 4]
        /*
         这里remove(1.txt)它，调用的是remove(int index)这个方法
         为什么它不是调用remove(Object obj)？因为1是基本数据类型，和int最匹配
         */
        list.remove(new Integer(1));//删除的是对象
        System.out.println(list);//[2, 3, 4]
    }

    @Test
    public void test2(){
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.set(3,100);
        System.out.println(list);

        Object obj=list.get(2);
        System.out.println(obj);
    }

    @Test
    public void test3(){
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        ListIterator listIterator=list.listIterator();
        while (listIterator.hasNext()){
            Object obj=listIterator.next();
            System.out.println(obj);//1.txt 2 3 4 5
        }
        System.out.println("------------");
        while (listIterator.hasPrevious()){
            Object obj=listIterator.previous();
            System.out.println(obj);//5 4 3 2 1.txt
        }
    }

    @Test
    public void test4(){
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        ListIterator listIterator=list.listIterator(list.size());//把游标指向最后
        while (listIterator.hasPrevious()){
            Object obj=listIterator.previous();
            System.out.println(obj);//5 4 3 2 1.txt
        }
    }
}
