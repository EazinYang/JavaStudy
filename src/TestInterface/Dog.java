package TestInterface;

public class Dog implements MyRunnable{

    @Override
    public void run() {
        System.out.println("用四个脚跑");
    }
}
