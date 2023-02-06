package Day21;

import org.junit.Test;

public class TestGenericClass2 {
    @Test
    public void test1(){
//        XueSheng<String> x=new XueSheng<String>("张三","优秀");//错误，因为String不是Number的子类
        XueSheng<Double> x1=new XueSheng<Double>("张三",89.5);
        XueSheng<Integer> x2=new XueSheng<Integer>("张三",89);
        XueSheng<Long> x3=new XueSheng<Long>("张三",89L);
    }
}
