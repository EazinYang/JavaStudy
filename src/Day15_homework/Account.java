package Day15_homework;

public class Account {
    int id;
    double balcne;
    double annualInterestRate;

    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }


}
