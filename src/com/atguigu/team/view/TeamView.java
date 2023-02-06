package com.atguigu.team.view;

import TestInterface.D;
import com.atguigu.team.doadmin.Architect;
import com.atguigu.team.doadmin.Designer;
import com.atguigu.team.doadmin.Employee;
import com.atguigu.team.doadmin.Programmer;
import com.atguigu.team.service.Data;
import com.atguigu.team.service.NameListService;
import com.atguigu.team.service.TeamException;
import com.atguigu.team.service.TeamService;
import com.atguigu.team.util.TSUtility;
import org.junit.Test;

import java.nio.file.LinkPermission;

public class TeamView {
    private NameListService listSvc=new NameListService();
    private TeamService teamSvc=new TeamService();

    public static void main(String[] args){
        TeamView t=new TeamView();
        t.enterMainMenu();
    }

    public void enterMainMenu(){
        while (true){
        System.out.println("-------------------------------------开发团队调度软件--------------------------------------");
        System.out.println("ID     姓名      年龄    工资      职位      状态      奖金      股票    领用设备");
        for(int i=0;i<listSvc.getAllEmployees().length;i++){
            System.out.println(listSvc.getAllEmployees()[i]);
        }
            System.out.print("1.txt-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1.txt-4)：");
            char send=TSUtility.readMenuSelection();
            switch (send){
                case '1':
                    listAllEmployees();
                    break;
                case '2':
                    addMember();
                    break;
                case '3':
                    deleteMember();
                    break;
                case '4':
                    System.out.println("确认是否退出(Y/N)");
                    char confirm=TSUtility.readConfirmSelection();
                    if(confirm=='Y'){
                    return;
                    }
            }
        }
    }

    public void listAllEmployees(){
        System.out.println("--------------------团队成员列表---------------------");
        System.out.println("TDI/ID     姓名      年龄    工资      职位      奖金      股票");
        for(int i=0;i<teamSvc.getTotal();i++){
            int tdi=teamSvc.getTeam()[i].getMemberld();
            int id=teamSvc.getTeam()[i].getId();
            int age=teamSvc.getTeam()[i].getAge();
            String name=teamSvc.getTeam()[i].getName();
            double salary=teamSvc.getTeam()[i].getSalary();
            String baseInfo=tdi+"/"+id+"\t\t\t"+name+"\t"+age+"  \t"+salary+"\t\t";
            if(teamSvc.getTeam()[i] instanceof Architect){
                Architect a=(Architect)teamSvc.getTeam()[i];
                double bonus=a.getBonus();
                double stock=a.getStock();
                System.out.println(baseInfo+"架构师"+"\t"+bonus+"\t"+stock);
            }else if(teamSvc.getTeam()[i] instanceof Designer){
                Designer d=(Designer)teamSvc.getTeam()[i];
                double bonus=d.getBonus();
                System.out.println(baseInfo+"设计师"+"\t"+bonus+"\t");
            }else {
                System.out.println(baseInfo+"程序员");
            }
        }
        System.out.println();
    }

    public void addMember() {
        System.out.println("---------------------添加成员---------------------");
        System.out.print("请输入要添加的员工ID：");
        int id = TSUtility.readInt();
        System.out.println();
        try {
            teamSvc.addMember(listSvc.getEmployee(id));
            System.out.println("添加成功");
        } catch (TeamException e) {
            System.out.println("添加失败，原因：" + e.getMessage());
        }
        TSUtility.readReturn();
    }

    public void deleteMember(){
        System.out.println("---------------------删除成员---------------------");
        System.out.print("请输入要删除员工的TID：");
        int id=TSUtility.readInt();
        System.out.println("(团队编号)");
        System.out.print("确认是否删除(Y/N)：");
        char confirm=TSUtility.readConfirmSelection();
        if(confirm=='Y'){
            try{
                teamSvc.removeMember(id);
                System.out.println("删除成功");
            }catch (TeamException e){
                System.out.println("删除失败，原因："+e.getMessage());
            }
        }
        TSUtility.readReturn();
    }
}
