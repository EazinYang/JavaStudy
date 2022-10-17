package studyAbstrack;

public class HourlyEmployee extends Employee{
    private int wage;
    private int hour;

    public HourlyEmployee(String name,Mydate md,int wage,int hour){
        super(name,md);
        this.wage=wage;
        this.hour=hour;
    }

    @Override
    double earnings() {
        return this.wage*this.hour;
    }

    @Override
    public String toString() {
        return "小时工"+super.toString();
    }
}
