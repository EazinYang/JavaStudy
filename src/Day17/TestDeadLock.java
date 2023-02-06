package Day17;

public class TestDeadLock {
    public static void main(String[] args){
        Object g=new Object();
        Object m=new Object();
        Boy b=new Boy(g,m);
        Bang bang=new Bang(g,m);
        b.start();
        bang.start();
    }
}
