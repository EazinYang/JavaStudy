package homework21;

import java.util.*;

public class Homework1 {
    public static void main(String[] args){
        char[] arr = new char[26+26+10];

        //使用字符数组保存原始字符
        for (int i = 0; i < arr.length; i++) {
            if(i<10){//前10个放数字
                arr[i] = (char)(i+48);
            }else if(i<10+26){//中间26个放大写字母
                arr[i] = (char)(i+65-10);
            }else{//剩下的放小写字母
                arr[i] = (char)(i+97-10-26);
            }
        }

        //随机生成10组验证码
        ArrayList<String> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            String str = "";
            for (int j = 0; j < 6; j++) {
                int index = rand.nextInt(arr.length);
                str += arr[index];
            }
            list.add(str);
        }
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
            System.out.println("随机验证码：" + iter.next());
        }
    }
}
