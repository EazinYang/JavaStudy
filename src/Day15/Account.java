package Day15;

public class Account {
    private double balance;

    public Account(double balance){
        super();
        this.balance=balance;
    }

    public boolean withdraw(double money)throws MoneyCannotNegativeException,RuntimeException{
        if(money<0){
            throw new MoneyCannotNegativeException("取款金额"+money+"有问题，取款金额不能为负数");
        }
        if(money>balance){
            throw new RuntimeException("余额不足");
        }
        balance-=money;
        return true;
    }
}
