package Day14;

public class TestWeek {
    public static void main(String[] args){
        System.out.print("请输入1-7的整数：");
        java.util.Scanner input=new java.util.Scanner(System.in);
        int num=input.nextInt();
        TestWeek t=new TestWeek();
        switch (num){
            case 1:
                Week m=Week.Monday;
                t.printWeek(m);
                break;
            case 2:
                Week tu=Week.Tuesday;
                t.printWeek(tu);
                break;
            case 3:
                Week w=Week.Wedenesday;
                t.printWeek(w);
                break;
            case 4:
                Week th=Week.Thursday;
                t.printWeek(th);
                break;
            case 5:
                Week f=Week.Friday;
                t.printWeek(f);
                break;
            case 6:
                Week sa=Week.Saturday;
                t.printWeek(sa);
                break;
            case 7:
                Week sun=Week.Sunday;
                t.printWeek(sun);
        }

    }

    public void printWeek(Week week){
        switch (week){
            case Monday:
                System.out.println("周一");
                break;
            case Tuesday:
                System.out.println("周二");
                break;
            case Wedenesday:
                System.out.println("周三");
                break;
            case Thursday:
                System.out.println("周四");
                break;
            case Friday:
                System.out.println("周五");
            case Saturday:
                System.out.println("周六");
                break;
            case Sunday:
                System.out.println("周日");
        }
    }
}
