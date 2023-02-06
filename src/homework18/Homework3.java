package homework18;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("输入第一个大字符串：");
        String big=input.next();
        System.out.print("输入第二个小字符串：");
        String small=input.next();
        int index;
        int count=0;
        while ((index=big.indexOf(small))!=-1){
            big=big.substring(index+small.length());
            count++;
        }
        System.out.println(small+"出现了"+count+"次");
    }
}
