package com.atguigu.bean;

public class Designer {
    private int bonus;

    public Designer(){}

    public Designer(int bonus){
        this.bonus=bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return this.bonus;
    }

    public void getInfo(){
        System.out.println("奖金："+this.bonus);
    }
}
