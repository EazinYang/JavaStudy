package homework17;

public class AccountManager {
    private Account account;

    public AccountManager(Account account) {
        this.account = account;
    }

    public synchronized void save(){
        double money=Math.random()*10000;
        System.out.println(Thread.currentThread().getName()+"开始存钱，目前账户状态："+account);
        System.out.println("本次存钱的数量是："+money);
        account.setBalance(account.getBalance()+money);
        System.out.println(Thread.currentThread().getName()+"存钱结束，目前账户状态："+account);
        this.notify();
    }

    public synchronized void withdraw(){
        double money=Math.random()*10000;
        System.out.println(Thread.currentThread().getName()+"开始取钱，目前账户状态："+account);
        while(money>account.getBalance()){
            try {
                System.out.println("本次想取钱的数量是："+money+",余额不足....");
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("本次取钱的数量是："+money);
        account.setBalance(account.getBalance()-money);
        System.out.println(Thread.currentThread().getName()+"取钱结束，目前账户状态："+account);
    }
}
