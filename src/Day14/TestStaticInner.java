package Day14;
//import Day14.Outer.Inner;

public class TestStaticInner {
    public static void main(String[] args){
//        Inner.test();//导包：import 包名.外部类名.内部类名
//        Outer.Inner.test();//外部类名.静态内部类.静态方法
//
//        Inner in1=new Inner();
//        Outer.Inner in2=new Outer.Inner();
//        in1.method();
//        Outer.Nei nei=new Outer.Nei();//报错
        //我们要在这里使用Nei,因为此时的Nei是Outer的非静态成员，所有需要用到Outer的对象
        Outer out=new Outer();
        Outer.Nei nei1=out.new Nei();//可行的，但写法奇怪的
        Outer.Nei nei2=out.getNei();//通过外部类中的getNei方法获取非静态内部类的对象
        nei1.method();
        nei2.method();
    }
}
