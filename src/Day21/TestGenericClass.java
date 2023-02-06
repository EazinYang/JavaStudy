package Day21;

import TestInterface.C;
import org.junit.Test;

public class TestGenericClass {
    @Test
    public void test1(){
        //语文老师
        Student<String> chinese=new Student<String>("张三","优秀");
        //数学老师
        Student<Double> math=new Student<Double>("张三",89.5);
        //英语老师
        Student<Character> english=new Student<Character>("张三",'A');

        ChineseStudent chineseStudent=new ChineseStudent("李四","优秀");
    }
}
