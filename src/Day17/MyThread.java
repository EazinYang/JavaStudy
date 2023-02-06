package Day17;

public class MyThread extends Thread {
    @Override
    public void run(){
        System.out.println("自定义线程");
//        try{
//            Thread.sleep(10000);//休眠10秒
//        }catch (InterruptedException e){
//            System.out.println("自定义线程被打断");
//            e.printStackTrace();
//        }
//        System.out.println("自定义线程休眠结束");
    }
}
