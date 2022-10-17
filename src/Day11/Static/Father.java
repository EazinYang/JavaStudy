package Day11.Static;

public class Father {
    private static String info=assign();
    static{
        System.out.println("父类的静态代码块");
    }
    public static String assign(){
        System.out.println("(3)assign()方法");
        return "Father";
    }
}
