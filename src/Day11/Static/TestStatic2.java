package Day11.Static;

public class TestStatic2 {
    static {
        System.out.println("TestStatic2静态代码块");
    }
    public static void main(String[] args){
        DemoFu d=new DemoFu();//创建一个类的对象时，会初始化类
    }
}
