package TestInterface;

public class TestMyRunnable {
    public static void main(String[] args){
        MyRunnable[] run=new MyRunnable[3];
        run[0]=new Car();
        run[1]=new Person();
        run[2]=new Dog();
        for(int i=0;i<run.length;i++){
            run[i].run();
        }
    }
}
