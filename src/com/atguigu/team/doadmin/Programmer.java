package com.atguigu.team.doadmin;

import com.atguigu.team.service.Status;

public class Programmer extends Employee{
    private int memberld;//开发团队id
    private Status status=Status.FREE;//成员状态
    private Equipment equipment;//成员领用的设备

    public Programmer(){
        super();
    }

    public Programmer(int id,String name,int age,double salary,Equipment equipment){
        super(id,name,age,salary);
        this.equipment=equipment;
    }

    public void setMemberld(int memberld) {
        this.memberld = memberld;
    }

    public int getMemberld() {
        return memberld;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Programmer(int id, String name, int age, double salary, int memberld, Status status, Equipment equipment) {
        super(id, name, age, salary);
        this.memberld = memberld;
        this.status = status;
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return getBasicInfo()+"\t\t" + "程序员\t"+status+"\t\t\t\t\t\t"+equipment;
    }

    public Equipment getEquipment() {
        return equipment;
    }
}
