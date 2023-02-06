package com.atguigu.team.doadmin;

import com.atguigu.team.service.Status;

public class Architect extends Designer {
    private int stock;//公司奖励的股票数量
    public Architect(int id,String name,int age,double salary,Equipment equipment,double bonus,int stock){
        super(id,name,age,salary,equipment,bonus);
        this.stock=stock;
    }

    public Architect(int id, String name, int age, double salary, int memberld, Status status, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, memberld, status, equipment, bonus);
        this.stock = stock;
    }

    public Architect(){
        super();
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return getBasicInfo()+"\t\t架构师\t"+getStatus()+"\t"+getBonus()+"\t\t"+stock+"\t"+getEquipment();
    }
}
