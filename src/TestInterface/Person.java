package TestInterface;

public class Person implements MyRunnable {
    @Override
    public void run() {
        System.out.println("用两个脚跑");
    }
}
