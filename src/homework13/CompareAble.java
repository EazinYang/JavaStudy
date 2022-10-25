package homework13;

import java.util.Comparator;

public interface CompareAble extends Comparator {
    public default void compare(Apple a,Apple b){
        if(a.getSize()>b.getSize()){
            System.out.println(a);
        }
    }
}
