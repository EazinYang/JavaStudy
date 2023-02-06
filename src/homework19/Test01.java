package homework19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class Test01 {
    @SuppressWarnings("all")
    public static void main(String[] args){
        char[] num=new char[62];
        for(int i=0;i<num.length;i++){
            if(i<10) {
                num[i] = (char) (i + 48);
            }else if(i>=10 && i<36){
                num[i]=(char)(i+65-10);
            }else {
                num[i]=(char)(i+97-36);
            }
        }

        Collection c=new ArrayList();
        for(int i=1;i<=10;i++){
            String s="";
            for(int j=0;j<6;j++){
                Random rand=new Random();
                int n=rand.nextInt(num.length);
                s+=num[n];
            }
            c.add(s);
        }

        Iterator iterator=c.iterator();
        while (iterator.hasNext()){
            Object s=iterator.next();
            System.out.println(s);
        }

    }
}
