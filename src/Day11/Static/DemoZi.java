package Day11.Static;

public class DemoZi extends DemoFu{
    {
        System.out.println("(8)");
    }
    static{
        System.out.println("(9)");
    }
    private static String info=assign();
    private String message=getMessage();
    static{
        System.out.println("(10)");
    }
    {
        System.out.println("(11)");
    }
    public DemoZi(){
        System.out.println("(12)");
    }
    public static String assign(){
        System.out.println("(13)");
        return "hello";
    }
    public String getMessage(){
        System.out.println("(14)");
        return "msg";
    }
}
