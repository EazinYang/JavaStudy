package homework19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Homework4 {
    @SuppressWarnings("all")
    public static void main(String[] args){
        Collection c=new ArrayList();
        for(int i=0;i<10;i++){
            int m;
            do{
                m=(int)(Math.random()*50+1);
            }while (c.contains(m));
            c.add(m);
        }
        Iterator iterator=c.iterator();
        while (iterator.hasNext()){
            Object obj=iterator.next();
            System.out.print(obj+"\t");
        }
        System.out.println();
        System.out.print("请输入你的乐透号码：");
        Collection client=new ArrayList();
        Scanner input=new Scanner(System.in);
        for(int j=0;j<10;j++){
            client.add(input.nextInt());
        }
        Iterator iterator1=client.iterator();
        while (iterator.hasNext()){
            Object obj=iterator.next();
            System.out.print(obj+"\t");
        }
        c.retainAll(client);
        int size=c.size();
        System.out.println("中了"+size+"个号码");
    }
}
