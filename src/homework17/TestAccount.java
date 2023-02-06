package homework17;

public class TestAccount {
    public static void main(String[] args){
        Account a=new Account("10086",0);
        AccountManager am=new AccountManager(a);
        Husband h=new Husband("小明",am);
        Wife w=new Wife("小红",am);
        h.start();
        w.start();
    }
}
