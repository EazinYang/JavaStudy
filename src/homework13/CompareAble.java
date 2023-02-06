package homework13;

import java.util.Comparator;

public interface CompareAble{
    public default void compare(Apple a,Apple b){
        if(a.getSize()>b.getSize()){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
}
