package Day11.Static;

public class Account {
    static double rate=0.035;//是account的所有对象共享的
    double balance=1000;//是account的每一个对象独立的

    public static void setRate(double rate) {
        Account.rate = rate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
