package homework13;

public class B implements A{
    @Override
    public void showA() {
        System.out.println("这是接口A的showA方法");
    }

    @Override
    public void showB() {
        System.out.println("这是接口A的showB方法");
    }
}
