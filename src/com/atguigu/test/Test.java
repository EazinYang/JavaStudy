package com.atguigu.test;
import com.atguigu.bean.Architect;
import com.atguigu.bean.Designer;
import com.atguigu.bean.Employee;
import com.atguigu.bean.Programmer;

public class Test {
    public static void main(String[] args){
        Employee e1=new Employee(1,"小明",18,"15900000001");
        e1.getInfo();

        Employee e2=new Employee();
        e2.setId(2);
        e2.setName("小红");
        e2.setAge(20);
        e2.setPhone("15900000002");
        System.out.println("编号："+e2.getId()+"，姓名："+e2.getName()+"，年龄："+e2.getAge()+"，手机号码："+e2.getPhone());

        Designer d1=new Designer(1000);
        d1.getInfo();

        Designer d2=new Designer();
        d2.setBonus(2000);
        System.out.println("奖金："+d2.getBonus());

        Programmer p1=new Programmer("Java");
        p1.getInfo();

        Programmer p2=new Programmer();
        p2.setLanguage("Python");
        System.out.println("编程语言："+p2.getLanguage());

        Architect a1=new Architect(100);
        a1.getInfo();

        Architect a2=new Architect();
        a2.setStock(200);
        System.out.println("股票数量："+a2.getStock());
    }
}
