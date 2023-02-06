package homework18;

import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args){
        /*
         * 必须至少9个字符。
         * 必须至少2个大写字符。
         * 必须只有小写字母和数字。
         */
        String password = "at1Gui2Gu";

        char[] arr = password.toCharArray();
        int upCount = 0;
        int numCount = 0;
        int lowerCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>='A' && arr[i]<='Z'){
                upCount++;
            }else if(arr[i]>='a' && arr[i]<='z'){
                lowerCount++;
            }else if(arr[i]>='0' && arr[i]<='9'){
                numCount++;
            }
        }
        System.out.print(password+"是否合法：");
        if(password.length() ==9 && upCount==2 && numCount!=0 && lowerCount!=0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
