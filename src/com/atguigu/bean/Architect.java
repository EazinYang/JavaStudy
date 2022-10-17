package com.atguigu.bean;

public class Architect {
    private int stock;

    public Architect(){}

    public Architect(int stock){
        this.stock=stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return this.stock;
    }

    public void getInfo(){
        System.out.println("持有股票数量："+this.stock);
    }
}
