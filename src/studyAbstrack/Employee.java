package studyAbstrack;

abstract class Employee {
    private String name;
    private Mydate birthday;

    abstract double earnings();

    public Employee(String name,Mydate birthday){
        this.name=name;
        this.birthday=birthday;
    }

    public Mydate getBirthday() {
        return birthday;
    }

    public  String toString(){
        return "姓名："+this.name+"，生日："+birthday.toDateString();
    }

}
