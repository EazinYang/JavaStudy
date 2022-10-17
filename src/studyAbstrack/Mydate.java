package studyAbstrack;

public class Mydate {
    private int month;
    private int day;
    private int year;

    public Mydate(int year,int month,int day){
        this.month=month;
        this.day=day;
        this.year=year;
    }

    public int getMonth() {
        return month;
    }

    String toDateString(){
        return this.year+"年"+this.month+"月"+this.day+"日";
    }
}
