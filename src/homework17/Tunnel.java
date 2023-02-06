package homework17;

public class Tunnel implements Runnable {
    private int person;
    @Override
    public void run() {
        while (person<=10){
            walk();
        }
    }

    public synchronized  void walk(){
            try{
                System.out.println(Thread.currentThread().getName()+"准备开始通过...");
                Thread.sleep(5000);
                person++;
                System.out.println(Thread.currentThread().getName()+"通过了隧道，他是第"+person+"个通过隧道");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
    }
}
