package Day14_1;

public class Outer{
    private int i=1;
    private static int j=2;
    public Father test(){
        final int a=10;//局部变量更改为局部的常量
        //局部内部类
        class Inner extends Father{
            public void method(){
                System.out.println(i);
                System.out.println(j);
                System.out.println(a);
            }
        }
        Inner in=new Inner();
        in.method();

        return in;
    }
}
