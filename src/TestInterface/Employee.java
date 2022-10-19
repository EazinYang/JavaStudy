package TestInterface;

public class Employee implements Comparable{
    private int id;
    private String name;
    private int age;
    private double salart;

    public Employee(int id,String name,int age,double salary){
        this.id=id;
        this.name=name;
        this.age=age;
        this.salart=salary;
    }

    public double getSalart() {
        return salart;
    }

    @Override
    public int compareTo(Object o) {
        return this.id-((Employee)o).id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salart=" + salart +
                '}';
    }
}
