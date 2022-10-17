package studyAbstrack;

public class Shirt extends Frock {
    private double size;

    public Shirt(double size){
        this.size=size;
    }

    @Override
    double calsArea() {
        return 1.3*this.size;
    }
}
