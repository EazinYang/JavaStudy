package Day21;

import org.junit.Test;

import java.util.ArrayList;
@SuppressWarnings("all")
public class TestGood {
    @Test
    public void test1(){
        ArrayList<String> list=new ArrayList<String>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
//        list.add(1.txt);//编译报错，因为我告诉ArrayList的元素类型是String，所以Integer对象进不去
        //此时不需要用Object处理了，因为它知道里面的类型是String
        for(String name:list){
            System.out.println(name.length());
        }
    }
}
