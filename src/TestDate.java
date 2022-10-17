public class TestDate {
    public static void main(String[] args){
        MyDate day1=new MyDate(1,10,2014);
        MyDate day2=new MyDate(1,10,2014);
        if(day1.equals(day2)){
            System.out.println(day1.toString());
            System.out.println(day2.toString());
        }else {
            System.out.println("两个对象不相同");
        }
    }
}
