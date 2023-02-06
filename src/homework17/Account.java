package homework17;

public class Account {
    private String account;
    private double balance;

    public Account(String account, double balance) {
        this.account = account;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "账户："+account+"，余额："+balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
