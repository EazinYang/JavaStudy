package Day17;

public class TestRunnable {
    public static void main(String[] args){
        MyRunnable my=new MyRunnable();
        Thread t=new Thread(my);
        t.start();
        for(int i=1;i<=100;i++){
            System.out.println("main："+i);
        }
    }
}
