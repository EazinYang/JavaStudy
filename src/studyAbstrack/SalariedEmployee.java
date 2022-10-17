package studyAbstrack;

public class SalariedEmployee extends Employee {
    private double monthlySalary;
    private int workingDay;
    private int totalDays;

    public SalariedEmployee(String name,Mydate md,double monthlySalary,int workingDay,int totalDays){
        super(name,md);
        this.monthlySalary=monthlySalary;
        this.workingDay=workingDay;
        this.totalDays=totalDays;
    }

    @Override
    double earnings() {
        return monthlySalary*(workingDay/totalDays);
    }

    @Override
    public String toString() {
       return "月薪工："+super.toString();
    }
}
