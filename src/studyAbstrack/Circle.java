package studyAbstrack;

class Circle extends Graphic{
    private double radius;

    public Circle(){
        super();
    }

    public Circle(double radius){
        super();
        this.radius=radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
