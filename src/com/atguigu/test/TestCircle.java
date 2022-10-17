package com.atguigu.test;

import com.atguigu.bean.Circle;

public class TestCircle {
    public static void main(String[] args){
        Circle c1=new Circle();
        c1.setR(5);
        System.out.println("圆的周长："+c1.getR()*2*3.14);

        Circle c2=new Circle(50);
        c2.showPerimete();
        c2.showArea();
    }

}
