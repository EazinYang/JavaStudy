package com.atguigu.test;

import com.atguigu.bean.MyDate;

public class TestDate {
    public static void main(String[] args){
        MyDate d=new MyDate(2022,8,29);
        d.showDate();
        if(d.isLeapYear()){
            System.out.println(d.getYear()+"是闰年");
        }else {
            System.out.println(d.getYear()+"不是闰年");
        }
    }
}
