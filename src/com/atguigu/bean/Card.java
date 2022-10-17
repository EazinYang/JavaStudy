package com.atguigu.bean;

public class Card {
    String color;
    int number;

    public Card(String color,int number){
        this.color=color;
        this.number=number;
    }

    public void showCard(){
        System.out.println(this.color+this.number);
    }
}
