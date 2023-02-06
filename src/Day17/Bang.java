package Day17;

public class Bang extends Thread{
    private Object girl;
    private Object money;

    public Bang(Object girl,Object money){
        this.girl=girl;
        this.money=money;
    }

    public void run(){
        synchronized (girl){
            System.out.println("你给我500万，我放了你女朋友");
            synchronized (money){
                System.out.println("拿到了钱，放了人");
            }
        }
    }
}
