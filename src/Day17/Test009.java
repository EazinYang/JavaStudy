package Day17;

public class Test009 {
    public static void main(String[] args){
//        Ticket t1=new Ticket("窗口一");
//        Ticket t2=new Ticket("窗口二");
//        Ticket t3=new Ticket("窗口三");
//        t1.start();
//        t2.start();
//        t3.start();
        Ticket02 t=new Ticket02();
        Thread t1=new Thread(t,"窗口一");
        Thread t2=new Thread(t,"窗口二");
        Thread t3=new Thread(t,"窗口三");
        t1.start();
        t2.start();
        t3.start();
    }
}
