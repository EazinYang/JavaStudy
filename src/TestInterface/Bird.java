package TestInterface;

public class Bird extends Animal implements Flyable,Jumpable{

    @Override
    public void fly() {
        System.out.println("小鸟振翅高飞");
    }

    @Override
    public void jump() {
        System.out.println("双脚跳");
    }
}
