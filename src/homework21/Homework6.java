package homework21;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Homework6 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static <T> void reverse(T[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            T temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }
}
