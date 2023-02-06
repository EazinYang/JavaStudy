package Day17;

public class TestThread2 {
    public static void main(String[] args){
        System.out.println("Hello Thread");
        MyThread my=new MyThread();
//        my.run();//这么调用就不是开启多线程，而是普通线程
        my.start();//从父类Thread中继承的
        for(int i=1;i<=100;i++){
            System.out.println("main："+i);
        }
    }
}
