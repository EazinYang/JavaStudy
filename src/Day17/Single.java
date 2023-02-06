package Day17;

public class Single {
    private static final Single INSTANCE=new Single();

    private Single(){}

    public static Single getInstance(){
        return INSTANCE;
    }
}
