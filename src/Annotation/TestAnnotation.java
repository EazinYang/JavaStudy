package Annotation;

import java.util.Arrays;
import java.util.Comparator;

public class TestAnnotation {
    @SuppressWarnings("Convert2Lambda")
    public static void main(String[] args){
        String[] all={"hello","Hi","Java","chai"};
        Arrays.sort(all, new Comparator() {
            @Override
            public int compare(Object o, Object t1) {
            String s1=(String)o;
            String s2=(String)t1;
            return s1.compareToIgnoreCase(s2);//忽略大小写
        }
    });
        for(int i=0;i<all.length;i++){
            System.out.println(all[i]);
        }
    }
}
