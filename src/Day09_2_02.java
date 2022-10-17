public class Day09_2_02 extends Day09_2_01{
    private double salary;

    public Day09_2_02(){
        super(null,0);
    }

    public Day09_2_02(String name,int age,double salary){
        super(name,age);//找的是父类的有参构造
        this.salary=salary;
    }
}
