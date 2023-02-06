package com.atguigu.team.doadmin;

import TestInterface.D;
import com.atguigu.team.service.Status;

public class Designer extends Programmer {
    private double bonus;//奖金

    public Designer(){
        super();
    }

    public Designer(int id,String name,int age,double salary,Equipment equipment,double bonus){
        super(id,name,age,salary,equipment);
        this.bonus=bonus;
    }

    public Designer(int id, String name, int age, double salary, int memberld, Status status, Equipment equipment, double bonus) {
        super(id, name, age, salary, memberld, status, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return getBasicInfo()+"\t\t设计师\t"+getStatus()+"\t"+bonus+"\t\t\t\t"+getEquipment();
    }
}
