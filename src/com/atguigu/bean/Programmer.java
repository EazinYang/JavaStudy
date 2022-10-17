package com.atguigu.bean;

public class Programmer {
    private String language;

    public Programmer(){}

    public Programmer(String language){
        this.language=language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return this.language;
    }

    public void getInfo(){
        System.out.println("编程语言：："+this.language);
    }
}
