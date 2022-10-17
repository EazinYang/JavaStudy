package Day11.Static;

public class Son extends Father{
    private static String info=assign();
    static {
        System.out.println("子类的静态代码块");
    }
    public static String assign(){
        System.out.println("(4)assign()方法");
        return "Son";
    }
}
