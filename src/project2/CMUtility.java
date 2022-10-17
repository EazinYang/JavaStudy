package project2;

import java.util.Scanner;


public class CMUtility {
    private static java.util.Scanner input=new java.util.Scanner(System.in);

    public static char readChar(){
        String str=readKeyBoard(1,false);
        return str.charAt(0);
    }

    public static char readChar(char defaultValue){
       String str=readKeyBoard(1,true);
       return (str.length()==0) ? defaultValue:str.charAt(0);
    }

    public static int readInt(){
        int number;
        for(;;) {
            String str = readKeyBoard(2, false);
            try {
                number = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("数字输入错误，请重新输入：");
            }
        }
        return number;
    }

    public static int readInt(int defaultValue){
        int number;
        for(;;) {
            String str = readKeyBoard(2, true);
            if (str.equals("")) {
                return defaultValue;
            }
            try {
                number = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("数字输入错误，请重新输入：");
            }
        }
        return number;
    }

    public static String readString(int limit){
        String str=readKeyBoard(limit,false);
        return str;
    }

    public static String readString(int limit,String defaultValue){
        String str=readKeyBoard(limit,true);
        return (str.length()==0) ? defaultValue:str;
    }

    public static String readKeyBoard(int limit,boolean blankReturn){
        String line="";
        while(input.hasNextLine()){
            line=input.nextLine();
            if(line.length()==0){
                if(blankReturn) return line;
                else continue;
            }

            if(line.length()<1 ||line.length()>limit){
                System.out.println("字符长度超过"+limit+"位，请重新输入！");
                continue;
            }
            break;
        }
        return line;
    }
}
