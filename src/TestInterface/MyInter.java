package TestInterface;

public interface MyInter {
    public static void test(){
        System.out.println("接口中的静态方法");
    }

    public default void method(){
        System.out.println("接口中的默认方法");
    }

    public abstract void fun();
}
