public class MyDate {
    int day;
    int month;
    int year;
    public MyDate(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj instanceof MyDate){
            MyDate md=(MyDate) obj;
            return this.day==md.day && this.month==md.month && this.year==md.year;
        }
        return false;
    }
}
