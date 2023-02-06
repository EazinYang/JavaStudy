package Day21;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class TestWildcards {
    /*
    声明一个方法：这个方法可以用于遍历Colletcion系列的集合
    此时因为Collection是一个泛型接口，Collection<E>
    如果此时不指定<E>的具体类型，会报警告，
    （1.txt）方式一：抑制警告
    （2）方式二：用?来代表任意类型
    因为此时不知道要被遍历的结合的元素类型是什么
     */
    public void print(Collection<?> c){
        for(Object object:c){
            System.out.println(object);
        }
    }

    @Test
    public void test1(){
        List<Integer> list= Arrays.asList(1,2,3,4);
        print(list);
    }

    //Object可以接收任意类型对象，但是不代表Collection<Object>可以接收任意泛型实参的集合
//    public void print(Collection<Object> c){
//        for(Object object:c){
//            System.out.println(object);
//        }
//    }
}
