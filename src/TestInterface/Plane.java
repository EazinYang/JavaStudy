package TestInterface;

public class Plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("靠发动机带动飞行");
    }
}
