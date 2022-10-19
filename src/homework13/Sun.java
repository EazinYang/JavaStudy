package homework13;

public class Sun extends Star implements Universe{
    @Override
    public void shine() {
        System.out.println("sun:光照八分钟，到达地球");
    }

    @Override
    public void doAnything() {
        System.out.println("sun:太阳吸引着9大行星旋转");
    }
}
