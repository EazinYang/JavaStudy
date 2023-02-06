package homework18;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入qq号码：");
        String qq = input.next();

        System.out.print("这个qq号是否正确：");
        if(qq.matches("[1-9][0-9]{4,11}+")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        input.close();
    }
}
