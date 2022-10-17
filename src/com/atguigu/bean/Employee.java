package com.atguigu.bean;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String phone;

    public Employee(){}

    public Employee(int id,String name,int age,String phone){
        this.id=id;
        this.name=name;
        this.age=age;
        this.phone=phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void getInfo(){
        System.out.println("编号:"+this.id+"，姓名："+this.name+"，年龄"+this.age+"，手机号码："+this.phone);
    }
}
