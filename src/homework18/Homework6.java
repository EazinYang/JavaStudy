package homework18;

import java.util.Arrays;

public class Homework6 {
    public static void main(String[] args){
        String[] arr = {"helloworld","java","chai","atguigu","lin","yan","Iloveyou"};

        System.out.println("原字符串：");
        System.out.println( Arrays.toString(arr));
        int index = 0;
        while(index < arr.length){
            if(arr[index].length()>5){
                System.arraycopy(arr, index+1, arr, index, arr.length-index-1);
                arr = Arrays.copyOf(arr, arr.length-1);
            }else{
                index++;
            }
        }
        System.out.println("删除后：");
        System.out.println(Arrays.toString(arr));
    }
}
