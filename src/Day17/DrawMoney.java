package Day17;

public class DrawMoney extends Thread {
    private Account account;
    private double dMoney;
    private Object lock=new Object();

    public DrawMoney(String name, Account account, double dMoney) {
        super(name);
        this.account = account;
        this.dMoney = dMoney;
    }

    @Override
    public void run(){
        while (true){
            synchronized (lock){
                if(account.getBalance()>0){
                    account.setBalance(account.getBalance()-dMoney);
                    System.out.println(getName()+"剩余："+account.getBalance());
                }
            }
        }
    }
}
