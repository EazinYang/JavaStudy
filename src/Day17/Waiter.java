package Day17;

public class Waiter extends Thread {
    private Workbench tai;

    public Waiter(String name,Workbench tai){
        super(name);
        this.tai=tai;
    }

    public void run(){
        while(true){
            tai.take();
        }
    }
}
