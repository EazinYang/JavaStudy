package homework17;

public class Wife extends Thread {
    private AccountManager am;

    public Wife(String name,AccountManager am) {
        super(name);
        this.am = am;
    }

    @Override
    public void run(){
        while (true){
            am.withdraw();
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
