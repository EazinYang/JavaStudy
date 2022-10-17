public class Day09_3_02 extends Day09_3_01{
    private double bonus;//奖金

    public Day09_3_02(String name,double salary,double bonus){
        super(name,salary);
        this.bonus=bonus;
    }

    public Day09_3_02(){
    }

    public double getBonus(){
        return bonus;
    }

    public void setBonus(double bonus){
        this.bonus=bonus;
    }

    //重写父类的getInfo方法
    public String getInfo(){
        //父类的name和salary的属性是私有的，不能在子类中直接使用
        //return "姓名："+name+"，薪资："+salary+"，奖金：+bonus;
        return "姓名："+getName()+"，薪资："+getSalary()+"，奖金："+bonus;
    }
}
