package Day14_homework;

import java.util.Scanner;

public class TestMonth {
    public static void main(String[] args){
        System.out.print("请输入月份：");
        java.util.Scanner input=new java.util.Scanner(System.in);
        int m=input.nextInt();
        Month month=Month.getByValue(m);
        System.out.println(month);
    }
}
