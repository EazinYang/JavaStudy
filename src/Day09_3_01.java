public class Day09_3_01 {
    private String name;
    private double salary;

    public Day09_3_01(){
    }

    public Day09_3_01(String name,double salary){
        this.name=name;
        this.salary=salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public String getInfo(){
        return "姓名："+name+"，薪资："+salary;
    }
}
