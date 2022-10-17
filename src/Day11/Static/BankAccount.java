package Day11.Static;

public class BankAccount {
    private String account;
    private String password;
    private int deposit;
    private double rate;
    private int minDeposit;

    public BankAccount(String account,String password){
        this.account=account;
        this.password=password;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public void setMinDeposit(int minDeposit) {
        this.minDeposit = minDeposit;
    }

}
