package Day21;

public class Circle extends Graphic {
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
