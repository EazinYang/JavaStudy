package com.atguigu.bean;

public class Circle {
    private double r;

    public Circle(){}

    public Circle(double r){
        this.r=r;
    }

    public void setR(double r){
        this.r=r;
    }

    public double getR(){
        return this.r;
    }

    public void showArea(){
        System.out.println("圆的面积："+this.r*this.r*3.14);
    }

    public void showPerimete(){
        System.out.println("圆形周长："+2*this.r*3.14);
    }
}
