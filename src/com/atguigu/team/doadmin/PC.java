package com.atguigu.team.doadmin;

public class PC implements Equipment {
    private String model;
    private String display;//显示器名称

    public PC(String model,String display){
        this.model=model;
        this.display=display;
    }

    @Override
    public String getDescription() {
        return model+"("+display+")";
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
