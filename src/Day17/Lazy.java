package Day17;

public class Lazy {
    private Lazy(){}

    private static class Inner{
        public static final Lazy INSTANCE=new Lazy();//在内部类创建外部类的唯一对象
    }

    public static Lazy getInstance(){
        return Inner.INSTANCE;
    }
}
