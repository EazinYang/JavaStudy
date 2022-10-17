package JiCheng;

public class Circle {
    private double radius;

    public Circle(){
        this.radius=1;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double findArea(){
        return 3.14*2*this.radius;
    }
}
