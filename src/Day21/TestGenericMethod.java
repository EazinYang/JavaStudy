package Day21;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class TestGenericMethod {
    @Test
    public void test01(){
        List<Integer> list1= Arrays.asList(1,2,3,4,5);
        List<String> list2= Arrays.asList("hello","java");

        Collection<String> c=new ArrayList<String>();
        c.add("张三");
        c.add("李四");

        String[] arr=new String[2];
        String[] array=c.toArray(arr);//根据arr的数组类型，确定返回值T[]类型
    }

    @Test
    public <T extends Number> T test(T t){
        return t;
    }

    @Test
    public void test03(){
        Integer num=test(1);
        Double d=test(1.0);
    }

}
