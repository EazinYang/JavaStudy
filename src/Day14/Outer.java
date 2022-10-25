package Day14;

public class Outer {
    private int i=1;
    private static int j=2;
//    //静态内部类
//    static class Inner{
//        public void method(){
//            System.out.println("静态内部类的非静态方法");
////            System.out.println(i);//报错，非静态方法不能调用非静态成员变量
//            System.out.println(j);
//        }
//
//        public static void test(){
//            System.out.println("静态内部类的静态方法");
//        }
//
//        public void outMethod(){
//            Inner in =new Inner();
//            in.method();//非静态方法，用对象名.方法名
//            Inner.test();//静态方法，用类名.方法名
//        }
//    }
    //非静态内部类
    class Nei{
        public void method(){
            System.out.println("非静态内部类的非静态方法");
            System.out.println(i);
            System.out.println(j);
        }
    }

    public static void outTest(){
//        Nei nei=new Nei();//报错，静态方法不能调用非静态类
    }

    public void outMethod(){
        Nei nei=new Nei();
        nei.method();
    }

    public Nei getNei(){//返回非静态内部类的对象
        return new Nei();
    }
}
