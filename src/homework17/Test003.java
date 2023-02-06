package homework17;

public class Test003 {
    public static void main(String[] args){
        PrintNumber p=new PrintNumber();
        Odd o1=new Odd(p);
        Odd o2=new Odd(p);
        o1.start();
        o2.start();
    }

}
