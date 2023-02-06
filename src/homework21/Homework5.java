package homework21;

public class Homework5 {
    public static void main(String[] args){
        Integer[] arr = {1,2,3,4,5,6};
        method(arr,0,1);
        for (Integer num : arr) {
            System.out.println(num);
        }
    }

    public static <T> void method(T[] arr,int a,int b){
        //元素互换
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
