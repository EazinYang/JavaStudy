package TestInterface;

public class C implements A,B {

    //在类中，重写接口的默认方法时，default需要删除
    public void test(){
        A.super.test();
    }
}
