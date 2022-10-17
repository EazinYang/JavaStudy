package com.atguigu.test;
import com.atguigu.bean.Book;

public class TestBook {
    public static void main(String[] args){
        Book[] b=new Book[5];
        b[0]=new Book();
        b[0].setName("语文书");
        b[0].setPrice(35);
        b[1]=new Book();
        b[1].setName("数学书");
        b[1].setPrice(30);
        b[2]=new Book();
        b[2].setName("英语书");
        b[2].setPrice(33);
        b[3]=new Book();
        b[3].setName("化学书");
        b[3].setPrice(40);
        b[4]=new Book();
        b[4].setName("物理书");
        b[4].setPrice(39);

        for(int i=0;i<b.length-1;i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i].getPrice() > b[j].getPrice()) {
                    String name = b[i].getName();
                    int price = b[i].getPrice();
                    b[i].setName(b[j].getName());
                    b[i].setPrice(b[j].getPrice());
                    b[j].setName(name);
                    b[j].setPrice(price);
                }
            }
        }

        for(int i=0;i<b.length;i++){
            System.out.println(b[i].getName()+"价格是："+b[i].getPrice());
        }
    }
}
