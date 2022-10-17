package SF;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public double findArea(){
        return Math.PI*radius*radius;
    }
}
