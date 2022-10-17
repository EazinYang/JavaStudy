package com.atguigu.bean;

public class MyDate {
    int year;
    int month;
    int day;

    public MyDate(int year,int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }

    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return this.year;
    }
    public void setMonth(int month){
        this.month=month;
    }
    public int getMonth(){
        return this.month;
    }
    public void setDay(int day){
        this.day=day;
    }
    public int getDay(){
        return this.day;
    }

    public void showDate(){
        System.out.println(this.year+"年，"+this.month+"月，"+this.day+"日");
    }

    public boolean isLeapYear(){
        boolean c=false;
        if(this.year%4==0 && this.year%100!=0 || this.year%400==0){
            c=true;
        }
        return c;
    }
}
