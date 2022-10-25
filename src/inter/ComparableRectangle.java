package inter;

public class ComparableRectangle extends Rectangle implements Comparable{

    public ComparableRectangle(double longs,double wide){
        super(longs,wide);
    }
    @Override
    public int compareTo(Object o) {
        Rectangle r=(Rectangle)o;
        if(this.getArea()>r.getArea()){
            return 1;
        }else if(this.getArea()<r.getArea()){
            return -1;
        }
        return 0;
    }
}
