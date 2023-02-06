package homework18;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str=input.next();

        StringBuilder s=new StringBuilder(str);
        System.out.println("反转后："+s.reverse());
    }
}
