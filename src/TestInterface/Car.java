package TestInterface;

public class Car implements MyRunnable {
    @Override
    public void run() {
        System.out.println("用轮子跑");
    }
}
