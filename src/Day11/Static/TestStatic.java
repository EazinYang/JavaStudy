package Day11.Static;

public class TestStatic {
    public static void main(String[] args){
        Account a1=new Account();
        Account a2=new Account();
        System.out.println("a1.rate="+a1.rate+"a1.balance="+a1.balance);
        System.out.println("a1.rate="+a2.rate+"a1.balance="+a2.balance);

        a1.rate=0.045;
        a1.balance=2000;
        System.out.println("a1.rate="+a1.rate+"a1.balance="+a1.balance);
        System.out.println("a1.rate="+a2.rate+"a1.balance="+a2.balance);
    }
}
