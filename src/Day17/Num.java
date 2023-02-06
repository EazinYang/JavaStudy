package Day17;

public class Num extends Thread{
    @Override
    public void run(){
        java.util.Random num=new java.util.Random();
        int number=num.nextInt(101);
        System.out.println(number);
    }
}
