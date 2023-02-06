package Day15;

import java.util.Scanner;

public class TestException {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        try{
            System.out.print("请输入一个整数：");
            int num=input.nextInt();
        }catch(Exception e){
            System.out.println("输入错误！");
        }

        try{
            testInput();
        }catch (Exception e){
            System.out.println("数据类型错误！");
        }
        System.out.println("main的其他代码");
    }

    public static void testInput(){
        Scanner input=new Scanner(System.in);
        try{
            System.out.print("请输入一个整数：");
            int num=input.nextInt();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界异常！");
        }
        System.out.println("其他代码");
    }
}
