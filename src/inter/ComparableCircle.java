package inter;

public class ComparableCircle extends Circle implements Comparable {

    public ComparableCircle(double radius){
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        Circle c=(Circle) o;
        if(this.getRadius()>c.getRadius()){
            return 1;
        }else if(this.getRadius()<c.getRadius()){
            return -1;
        }
        return 0;
    }
}
