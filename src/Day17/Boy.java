package Day17;

public class Boy extends Thread {
    private Object girl;
    private Object money;

    public Boy(Object girl,Object money){
        this.girl=girl;
        this.money=money;
    }

    public void run(){
        synchronized (money){
            System.out.println("你放了我女朋友，我给你500万");
            synchronized(girl){
                System.out.println("给了对方500万");
            }
        }
    }
}
