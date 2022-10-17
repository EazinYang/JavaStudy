public class Day10_2_7 extends Day10_2_6{//圆形
    private double radius;

    public Day10_2_7(double radius){
        this.radius=radius;
    }

    //重写
    public double getArea(){
        return 3.14*this.radius*this.radius;
    }

}
