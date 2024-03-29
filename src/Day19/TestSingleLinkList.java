package Day19;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestSingleLinkList {
    public static void main(String[] args){
        SingleLinkedList list=new SingleLinkedList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.add("钱七");
        System.out.println("元素个数："+list.size());

        Object[] all=list.getAll();
        System.out.println(Arrays.toString(all));

        list.remove("张三");
        System.out.println("元素个数："+list.size());
        all=list.getAll();
        System.out.println(Arrays.toString(all));

        list.remove("王五");
        System.out.println("元素个数："+list.size());
        all=list.getAll();
        System.out.println(Arrays.toString(all));

        list.remove("钱七");
        System.out.println("元素个数："+list.size());
        all=list.getAll();
        System.out.println(Arrays.toString(all));
    }
}
