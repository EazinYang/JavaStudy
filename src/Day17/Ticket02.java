package Day17;

public class Ticket02 implements Runnable {
    private int total=10;

    @Override
    public void run() {
        while(total>0){
            saleOneTicket();
        }
    }

    public synchronized void saleOneTicket(){
        if(total>0){
            System.out.println(Thread.currentThread().getName()+"卖出一张票");
            total--;
            System.out.println("剩余"+total);
        }
    }
}
