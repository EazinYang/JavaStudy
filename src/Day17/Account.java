package Day17;

import java.util.Objects;

public class Account {
    private String id;
    private  static double balance=100;

    public Account(){}

    public Account(String id, double balance) {
        this.id = id;
        Account.balance= balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(id, account.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
