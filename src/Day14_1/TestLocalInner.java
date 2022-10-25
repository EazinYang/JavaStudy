package Day14_1;

public class TestLocalInner {
    public static void main(String[] args){
        Outer out=new Outer();
        Father in=out.test();//在外部类的外面虽然不能使用局部内部类，但是可以得到它的对象
        System.out.println(in.getClass());
        in.method();//在这里仍然可以访问到这个a，那么这个a就不能存在栈中，得挪到方法区，变为常量
    }
}
