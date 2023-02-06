package Day17;

public class Cook extends Thread{
    private Workbench tai;

    public Cook(String name,Workbench tai){
        super(name);
        this.tai=tai;
    }

    public void run(){
        while (true){
            tai.put();
        }
    }
}
