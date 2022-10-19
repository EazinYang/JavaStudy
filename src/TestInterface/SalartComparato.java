package TestInterface;
import java.util.Comparator;
class SalartComparator implements Comparator{
    @Override
    public int compare(Object o, Object t1) {
        Employee e1=(Employee) o;
        Employee e2=(Employee) t1;
        if(e1.getSalart()<e2.getSalart()){
            return 1;
        }else if(e1.getSalart()>e2.getSalart()){
            return -1;
        }
        return 0;
    }
}
