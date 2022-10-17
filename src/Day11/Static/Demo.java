package Day11.Static;

class DemoFu {
    {
        System.out.println("(1)Demo的非静态代码块1");
    }
    static{
        System.out.println("(2)Demo的静态代码块2");
    }
    private static String info=assign();
    private String message=getMessage();
        static{
        System.out.println("(3)Demo的静态代码块3");
    }
    {
        System.out.println("(4)DEmo的非静态代码块2");
    }
    public DemoFu(){
        System.out.println("(5)无参构造器");
    }
    public static String assign(){
        System.out.println("(6)assign()方法");
        return "hello";
    }
    public String getMessage(){
        System.out.println("(7)assign()方法");
        return "msg";
    }
}
