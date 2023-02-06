package Day17;

public class EvenNumber extends Thread{
    @Override
    public void run(){
        java.util.Random num=new java.util.Random();
        int i;
        do {
            i=num.nextInt(101);
        }while (i%2!=0);
        System.out.println("偶数："+i);
    }
}
