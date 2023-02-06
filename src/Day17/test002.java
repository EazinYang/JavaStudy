package Day17;

public class test002 {
    public static void main(String[] args){
        Thread1 t1=new Thread1("线程1");
        Thread1 t2=new Thread1("线程2");
        t1.start();
        t2.start();
    }
}
