package com.atguigu.team.service;

import com.atguigu.team.doadmin.*;
import static com.atguigu.team.service.Data.*;

public class NameListService {
    private Employee[] all;//公司所有员工对象

    public NameListService(){
        all=new Employee[EMPLOYEES.length];
        for(int i=0;i<all.length;i++){
            int empType=Integer.parseInt(EMPLOYEES[i][0]);
            int id=Integer.parseInt(EMPLOYEES[i][1]);
            String name=EMPLOYEES[i][2];
            int age=Integer.parseInt(EMPLOYEES[i][3]);
            double salary=Double.parseDouble(EMPLOYEES[i][4]);
            switch (empType){
                case EMPLOYEE:
                    all[i]=new Employee(id,name,age,salary);
                    break;
                case PROGRAMMER:
                    all[i]=new Programmer(id,name,age,salary,getEquipment(i));
                    break;
                case DESIGNER:
                    all[i]=new Designer(id,name,age,salary,getEquipment(i),Double.parseDouble(EMPLOYEES[i][5]));
                    break;
                case ARCHITECT:
                    all[i]=new Architect(id,name,age,salary,getEquipment(i), Double.parseDouble(EMPLOYEES[i][5]),Integer.parseInt(EMPLOYEES[i][6]));
            }
        }
    }

    public Employee[] getAllEmployees(){
        return all;
    }

    public Employee getEmployee(int id){
        for(int i=0;i<all.length;i++){
            if(id==all[i].getId()){
                return all[i];
            }
        }
        return null;
    }

    private Equipment getEquipment(int i){
        switch (EQIPMENTS[i][0]){
            case "21":
                return new PC(EQIPMENTS[i][1],EQIPMENTS[i][2]);
            case "22":
                return new NoteBook(EQIPMENTS[i][1],Double.parseDouble(EQIPMENTS[i][2]));
            case "23":
                return new Printer(EQIPMENTS[i][1],EQIPMENTS[i][2]);
        }
        return null;
    }
}
