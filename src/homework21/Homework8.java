package homework21;

import java.util.Comparator;
import java.util.TreeSet;

public class Homework8 {
    public static void main(String[] args){
        TreeSet<Students> set=new TreeSet<>();
        set.add(new Students("liusan",20,90.0));
        set.add(new Students("lisi",22,90.0));
        set.add(new Students("wangwu",20,99.0));
        set.add(new Students("sunliu",22,100.0));
        for(Students stu:set){
            System.out.println(stu);
        }
        System.out.println("按照姓名排序：");
        TreeSet<Students> all = new TreeSet<Students>(new Comparator<Students>() {
            @Override
            public int compare(Students s, Students t1) {
                return s.getName().compareTo(t1.getName());
            }
        });
        all.addAll(set);

        for (Students student : all) {
            System.out.println(student);
        }
    }
}
