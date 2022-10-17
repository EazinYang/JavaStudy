public class Day10_2_8 extends Day10_2_6{//矩形
    private double length;
    private double width;
    public Day10_2_8(double length,double width){
        this.length=length;
        this.width=width;
    }

    //重写
    public double getArea(){
        return this.length*this.width;
    }
}
