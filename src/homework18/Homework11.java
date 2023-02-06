package homework18;

import java.util.Arrays;

public class Homework11 {
    public static void main(String[] args){
        String abc="342567891";
        char[] all=abc.toCharArray();
        Arrays.sort(all);
        abc=new String(all);
        System.out.println(abc);
    }
}
