package homework17;

public class PrintNumber {
    private int num=1;

    public synchronized void print(){
        try{
            this.notify();
            System.out.println(Thread.currentThread().getName()+"："+num);
            num++;
            this.wait();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
