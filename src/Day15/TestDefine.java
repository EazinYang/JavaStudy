package Day15;

public class TestDefine {
    public static void main(String[] args){
        Account a=new Account(100);
        try{
            a.withdraw(-100);
        }catch (MoneyCannotNegativeException e){
            e.printStackTrace();
        }

    }
}
