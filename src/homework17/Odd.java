package homework17;


public class Odd extends Thread{
    private PrintNumber p;

    public Odd(PrintNumber p) {
        this.p = p;
    }

    @Override
    public void run(){
        while (true){
            try{
                p.print();
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
