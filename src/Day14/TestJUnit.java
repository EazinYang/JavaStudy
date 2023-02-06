package Day14;

import org.junit.*;

public class TestJUnit {
//    @Test
//    void method(){
//        System.out.println("非public");//java.lang.Exception: Method method() should be public
//    }

    @Test
    public void test1(){
        System.out.println("hello junit1");
    }

    @Before
    public void init(){
        System.out.println("开始...");
    }

    @After
    public void close(){
        System.out.println("结束...");
    }

    public void method(String str){
        System.out.println("有参的method:"+str);
    }

    @Test
    public void testMethod(){
        method("Hello");
    }

    @BeforeClass
    public static void clinit(){
        System.out.println("类开始前...");
    }

    @AfterClass
    public static void destory(){
        System.out.println("类结束后...");
    }
}
