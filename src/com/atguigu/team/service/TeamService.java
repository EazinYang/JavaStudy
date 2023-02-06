package com.atguigu.team.service;

import com.atguigu.team.doadmin.Architect;
import com.atguigu.team.doadmin.Designer;
import com.atguigu.team.doadmin.Employee;
import com.atguigu.team.doadmin.Programmer;

import java.util.Arrays;

public class TeamService {
    private int counter=1;//为开发团队新增成员生成唯一ID，即memberId
    private final int Max_MEMBER=5;//发开团队最大成员数
    private Programmer[] team =new Programmer[Max_MEMBER];//当前团队的成员对象
    private int total=0;//团队成员的实际人数

    public Programmer[] getTeam(){
        return team;
    }

    public void addMember(Employee e) throws TeamException{
        if(total>=Max_MEMBER){
            throw new TeamException("成员已满，无法添加");
        }
        if(!(e instanceof Programmer)){
            throw new TeamException("该成员不是开发人员，无法添加");
        }
        Programmer p=(Programmer)e;
        switch (p.getStatus()){
            case BUSY:
                throw new TeamException("该员已是团队成员");
            case VOCATION:
                throw new TeamException("该员工正在休假，无法添加");
        }
        int programmer=0;
        int designer=0;
        int architech=0;
        for(int i=0;i<total;i++){
            if(team[i] instanceof Architect){
                architech++;
            }else if(team[i] instanceof Designer){
                designer++;
            }else {
                programmer++;
            }
        }
        if(e instanceof Architect){
            if(architech>=1){
                throw new TeamException("团队中只能有一名架构师");
            }
        }else if(e instanceof Designer){
            if(designer>=2){
                throw new TeamException("团队中只能有两名设计师");
            }
        }else {
            if(programmer>=3){
                throw new TeamException("团队中只能有三名程序员");
            }
        }
        team[total]=p;
        team[total].setMemberld(counter++);
        team[total].setStatus(Status.BUSY);
        total++;
    }

    public void removeMember(int memberId) throws TeamException{
        for(int i=0;i<total;i++){
            if(team[i].getMemberld()==memberId){
                team[i].setStatus(Status.FREE);
                java.lang.System.arraycopy(team,i+1,team,i,total-i-1);
                total--;
                return;
            }
        }
        throw new TeamException("成员不存在");
    }

    public int getTotal() {
        return total;
    }
}
