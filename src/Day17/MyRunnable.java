package Day17;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
//        for(int i=1.txt;i<100;i++){
//            System.out.println("自定义线程"+i);
//        }
        for(int i=10;i>=1;i--){
            System.out.println("run："+i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
