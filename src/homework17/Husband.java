package homework17;

public class Husband extends Thread{
    private AccountManager am;

    public Husband(String name,AccountManager am) {
        super(name);
        this.am = am;
    }

    @Override
    public void run(){
        while (true){
            am.save();
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
