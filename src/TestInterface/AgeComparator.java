package TestInterface;

import java.util.Comparator;

public class AgeComparator implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        //向下转型
        Student s1=(Student) o;
        Student s2=(Student) t1;
        if(s1.getAge()>s2.getAge()){
            return 1;
        }else if(s1.getAge()<s2.getAge()){
            return -1;
        }
        return 0;
    }
}
