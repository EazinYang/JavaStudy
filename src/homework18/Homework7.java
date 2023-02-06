package homework18;

import org.junit.Test;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args){
        System.out.print("请输入字符串：");
        Scanner input =new Scanner(System.in);
        String str=input.next();
        boolean boo=false;
        char[] arr=str.toCharArray();
        for(int i=0;i<str.length()/2;i++){
            if(arr[i]!=arr[arr.length-i-1]){
                boo=false;
                break;
            }
        }
        if(boo){
            System.out.println(str+"是回文字符串");
        }else {
            System.out.println(str+"不是回文字符串");
        }
    }

    @Test
    public void test01(){
        System.out.print("请输入字符串：");
        Scanner input =new Scanner(System.in);
        String str1=input.next();
        StringBuilder s=new StringBuilder(str1);
        String str2=s.reverse().toString();
        if(str1.equals(str2)){
            System.out.println(str1+"是回文字符串");
        }else {
            System.out.println(str1+"不是回文字符串");
        }
    }
}
