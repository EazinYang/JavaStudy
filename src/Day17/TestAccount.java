package Day17;

public class TestAccount {
    public static void main(String[] args){
        Account a=new Account("小红",100);
        DrawMoney d1=new DrawMoney("小红1",a,20);
        DrawMoney d2=new DrawMoney("小红2",a,5);
        DrawMoney d3=new DrawMoney("小红3",a,10);
        d1.start();
        d2.start();
        d3.start();
    }
}
