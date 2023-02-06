package Day14_homework;

import TestInterface.D;

public enum Month {
    January(1,"1月"),February(2,"2月"),
    March(3,"3月"),April(4,"4月"),
    May(5,"5月"),June(6,"6月"),
    July(7,"7月"),August(8,"8月"),
    September(9,"9月"),October(10,"10月"),
    November(11,"11月"),December(12,"12月");
    private int value;
    private String description;

    private Month(int value,String description){
        this.value=value;
        this.description=description;
    }

    public static Month getByValue(int value){
        return Month.values()[value-1];
    }

    @Override
    public String toString() {
        return this.value+"->"+name()+"->"+this.description;
    }
}
