package homework21;

import java.util.Arrays;
import java.util.Comparator;

public class Homework7 {
    public static void main(String[] args){
        Integer[] arr = {2,4,7,1,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));

        String[] all = {"hello","Hello","Chai","chai"};
        sort(all,new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        System.out.println(Arrays.toString(all));
    }

    public static <T> void sort(T[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                Comparable<T> left = (Comparable<T>) arr[j];
                if(left.compareTo(arr[j+1])>0){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static <T> void sort(T[] arr, Comparator<? super T> c){
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if(c.compare(arr[j], arr[j+1])>0){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
