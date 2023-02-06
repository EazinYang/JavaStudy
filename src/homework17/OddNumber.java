package homework17;

public class OddNumber extends Thread {
    private int num=1;
    @Override
    public void run(){
        while (true){
            synchronized(Thread.class){
                for(int i=1;i<=5;i++){
                    System.out.println("奇数线程，第"+i+"个："+num);
                    num+=2;
                    try{
                        Thread.sleep(500);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
