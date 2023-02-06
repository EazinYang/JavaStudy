package homework17;

import org.junit.Test;

import java.util.Scanner;

public class Test005 {
    @Test
    public void test01(){
        String str="HelloWorld";

        //统计大写字母的个数
        char[] arr=str.toCharArray();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>='A'&& arr[i]<='Z'){
                count++;
            }
        }
        System.out.println("大写字母的个数："+count);
    }

    public void test02(){
        Scanner input=new Scanner(System.in);
        System.out.println("请输入性别：");
        String str=input.next();
        char gender=str.charAt(0);
        System.out.println(gender);
    }

    public void test03(){
        String str="HelloWorld";
        System.out.println(str.charAt(4));//o
    }
    @Test
    public void test04(){
        char[] arr={'h','e','l','l','o'};
        String string1=new String(arr);
        String string2=new String(arr,2,3);
        System.out.println(string1);//hello
        System.out.println(string2);//llo
    }
}
