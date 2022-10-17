public class Day05_10_2 {
    private double radius;

    //double r：构造器的形参列表
    public Day05_10_2(double r){
        radius=r;//给半径赋值
    }

    public Day05_10_2(){//无参构造
    }

    public void printInfo(){
        System.out.println("半径："+radius);
    }

    public void setRdius(double r){
        radius=r;
    }
}
